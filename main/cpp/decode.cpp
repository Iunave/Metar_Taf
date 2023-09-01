#include <iostream>
#include <map>
#include <jni.h>

#include "icao2name.hpp"

std::map<std::string_view, std::string_view> weather_codes
        {
                std::make_pair("VC", "in the vicinity"),
                std::make_pair("RE", "most important recent phenomena"),
                std::make_pair("MI", "shallow"), //fog descriptor
                std::make_pair("PR", "partial"), //fog descriptor
                std::make_pair("BC", "patches"), //fog descriptor
                std::make_pair("DR", "low drifting"),
                std::make_pair("BL", "blowing"),
                std::make_pair("SH", "showers"),
                std::make_pair("TS", "thunderstorm"),
                std::make_pair("FZ", "freezing"),
                std::make_pair("DZ", "drizzle"),
                std::make_pair("RA", "rain"),
                std::make_pair("SN", "snow flakes"),
                std::make_pair("SG", "snow grains"),
                std::make_pair("GS", "small hail"),
                std::make_pair("GR", "hail"),
                std::make_pair("PL", "ice pellets"),
                std::make_pair("IC", "ice crystals"),
                std::make_pair("UP", "unknown precipitation"),
                std::make_pair("FG", "fog"),
                std::make_pair("BR", "mist"),
                std::make_pair("HZ", "haze"),
                std::make_pair("VA", "volcanic ash"),
                std::make_pair("DU", "widespread dust"),
                std::make_pair("FU", "smoke"),
                std::make_pair("SA", "sand"),
                std::make_pair("PY", "spray"),
                std::make_pair("SQ", "squail"),
                std::make_pair("PO", "dust or sand whirls"),
                std::make_pair("DS", "dust storm"),
                std::make_pair("SS", "sand storm"),
                std::make_pair("FC", "funnel cloud")
        };

std::map<std::string_view, std::string_view> cloud_codes
        {
                std::make_pair("SKC", "sky clear"),
                std::make_pair("NCD", "nil cloud detected"),
                std::make_pair("CLR", "no clouds below 3700m"),
                std::make_pair("NSC", "nil significant cloud"),
                std::make_pair("FEW", "few"),
                std::make_pair("SCT", "scattered"),
                std::make_pair("BKN", "broken"),
                std::make_pair("OVC", "overcast"),
                std::make_pair("TCU", "towering cumulunimbus"),
                std::make_pair("CB", "cumulunimbus"),
                std::make_pair("VV", "vertical visibility")
        };

std::string make_string(const char* start, const char* end) //needed becouse of lacking implementation in the android stl
{
    size_t len = std::distance(start, end);
    return std::string{start, len};
}

std::string_view make_string_view(const char* start, const char* end) //needed becouse of lacking implementation in the android stl
{
    size_t len = std::distance(start, end);
    return std::string_view{start, len};
}

template<typename... VarArgs>
std::string format(const char* fmt, VarArgs&&... args)
{
    constexpr uint64_t BUFFER_SIZE = 512;
    static thread_local char buffer[BUFFER_SIZE];

    size_t written = snprintf(&buffer[0], BUFFER_SIZE, fmt, (std::string{args}.data())...);

    if(written >= BUFFER_SIZE)
    {
        throw std::invalid_argument(fmt);
    }

    return std::string{buffer, written};
}

std::string decode_station_id(std::string_view str)
{
    std::string_view station_name = "unknown";
    return format("%s - %s", str, station_name);
}

std::string decode_date_time(std::string_view str)
{
    std::string_view day = str.substr(0, 2);
    std::string_view hour = str.substr(2, 2);
    std::string_view minute = str.substr(4, 2);
    return format("observation time: %s/%s/%s zulu", day, hour, minute);
}

std::string decode_auto_modifier(std::string_view str)
{
    return "flag: automatic";
}

std::string decode_cor_modifier(std::string_view str)
{
    return "flag: correction";
}

std::string decode_wind_primary(std::string_view str)
{
    std::string_view direction = str.substr(0, 3);
    std::string_view speed = str.substr(3, 2);

    std::string result{};

    if(direction == "VRB")
    {
        result = format("wind: variable %s knots", speed);
    }
    else
    {
        result = format("wind: %s degrees %s knots", direction, speed);
    }

    if(str[5] == 'G')
    {
        std::string_view gust_speed = str.substr(6, 2);
        result.append(format("\nwind gust: %s knots", gust_speed));
    }

    return result;
}

std::string decode_wind_variable(std::string_view str)
{
    std::string_view from = str.substr(0, 3);
    std::string_view to = str.substr(4, 3);
    return format("wind variable: between %s and %s degrees", from, to);
}

std::string decode_visibility(std::string_view str)
{
    if(str == "9999")
    {
        return "visibility: > 10 kilometers";
    }
    else if(str == "CAVOK")
    {
        return "ceiling and visibility ok";
    }
    else
    {
        for(uint64_t idx = 0; idx < str.length(); ++idx)
        {
            if(str[idx] >= 'A' && str[idx] <= 'z')
            {
                if(str[0] == 'M')
                {
                    std::string_view stature_miles = str.substr(1, str.length() - 3);
                    return format("visibility: <%s stature miles", stature_miles);
                }
                else if(str[0] == 'P')
                {
                    std::string_view stature_miles = str.substr(1, str.length() - 3);
                    return format("visibility: >%s stature miles", stature_miles);
                }
                else
                {
                    std::string_view stature_miles = str.substr(0, str.length() - 2);
                    return format("visibility: %s stature miles", stature_miles);
                }
            }
        }

        return format("visibility: %s meters", str);
    }
}

std::string decode_weather_obscurations(std::string_view str)
{
    std::string result{};
    const char* weather_start;

    if(str[0] == '+')
    {
        result = "heavy";
        weather_start = str.data() + 1;
    }
    else if(str[0] == '-')
    {
        result = "light";
        weather_start = str.data() + 1;
    }
    else
    {
        result = "moderate";
        weather_start = str.data();
    }

    while(*weather_start != ' ')
    {
        const char* weather_end = weather_start + 2;
        std::string_view weather_code = make_string_view(weather_start, weather_end);

        auto translated = weather_codes.find(weather_code);
        if(translated == weather_codes.end())
        {
            result += " unknown weather code";
        }
        else
        {
            result += ' ';
            result += translated->second;
        }

        weather_start += 2;
    }

    return result;
}

std::string decode_sky_conditions(std::string_view str)
{
    uint64_t numbers_start = 0;
    while(numbers_start < str.size())
    {
        if(str[numbers_start] >= '0' && str[numbers_start] <= '9')
        {
            break;
        }
        ++numbers_start;
    }

    if(numbers_start == str.size() - 1)
    {
        std::string_view decoded_cc{};

        auto found_cc = cloud_codes.find(str);
        if(found_cc == cloud_codes.end())
        {
            decoded_cc = "unknown cloud code";
        }
        else
        {
            decoded_cc = found_cc->second;
        }

        return format("%s", decoded_cc);
    }
    else
    {
        std::string_view cloud_code = make_string_view(str.begin(), str.begin() + numbers_start);
        std::string_view numbers = make_string_view(str.begin() + numbers_start, str.end());

        if(numbers == "///")
        {
            numbers = "unknown altitude";
        }

        std::string_view decoded_cc{};

        auto found_cc = cloud_codes.find(cloud_code);
        if(found_cc == cloud_codes.end())
        {
            decoded_cc = "unknown cloud code";
        }
        else
        {
            decoded_cc = found_cc->second;
        }

        return format("%s at %sft", decoded_cc, numbers);
    }
}

std::string decode_temperature_dewpoint(std::string_view str)
{
    auto PM2posneg = [](std::string& tmp)
    {
        if(tmp[0] == 'P')
        {
            tmp[0] = '+';
        }
        else if(tmp[0] == 'M')
        {
            tmp[0] = '-';
        }
    };

    size_t divider = str.find('/');

    std::string temperature = make_string(str.begin(), str.begin() + divider);
    std::string dewpoint = make_string(str.begin() + divider + 1, str.end());

    PM2posneg(temperature);
    PM2posneg(dewpoint);

    return format("temperature %s celsius\ndewpoint %s celsius", temperature, dewpoint);
}

std::string decode_air_pressure(std::string_view str)
{
    std::string pressure = make_string(str.begin() + 1, str.end());
    return format("QNH air pressure: %s hectopascal", pressure);
}

std::string decode_remarks(std::string_view str)
{
    return format("remark: %s", str);
}

enum metar_decoding_step_e : uint64_t
{
    station_id, //ICAO
    date_time, //zulu time
    automatic_modifier, //optional,
    correction_modifier, //optional
    wind_primary,
    wind_variable, //optional
    visibility, //statue miles
    weather_obscurations, //optional
    sky_conditions,
    temperature_dewpoint,
    air_pressure,
    remarks
};

std::string decode_metar(std::string_view metar)
{
    metar_decoding_step_e step = station_id;
    std::string decoded{};

    uint64_t start = 0;
    for(uint64_t end = 0; end < metar.size() + 1; ++end)
    {
        char character = metar[end];
        if(character == ' ' || character == '\0')
        {
            std::string_view view = make_string_view(metar.data() + start, metar.data() + end);
            start = end + 1;
            end += 1;

            switch(step)
            {
                case station_id:
                {
                    step = metar_decoding_step_e::date_time;
                    decoded.append(decode_station_id(view));
                    break;
                }
                case date_time:
                {
                    step = metar_decoding_step_e::automatic_modifier;
                    decoded.append(decode_date_time(view));
                    break;
                }
                case automatic_modifier:
                {
                    step = metar_decoding_step_e::correction_modifier;

                    if(view == "AUTO")
                    {
                        decoded.append(decode_auto_modifier(view));
                        break;
                    }
                }
                case correction_modifier:
                {
                    step = metar_decoding_step_e::wind_primary;

                    if(view == "COR")
                    {
                        decoded.append(decode_cor_modifier(view));
                        break;
                    }
                }
                case wind_primary:
                {
                    step = metar_decoding_step_e::wind_variable;
                    decoded.append(decode_wind_primary(view));
                    break;
                }
                case wind_variable:
                {
                    step = metar_decoding_step_e::visibility;

                    if(view.size() == 7 || !(view == "CAVOK")) //otherwise its visibility
                    {
                        decoded.append(decode_wind_variable(view));
                        break;
                    }
                }
                case visibility:
                {
                    step = metar_decoding_step_e::weather_obscurations;
                    decoded.append(decode_visibility(view));
                    break;
                }
                case weather_obscurations:
                {
                    uint64_t view_idx = 0;
                    for(;view_idx < view.size() + 1; ++view_idx)
                    {
                        if(view[view_idx] >= '0' && view[view_idx] <= '9' || view[view_idx] == '\0')
                        {
                            break;
                        }
                    }

                    std::string_view letters = view.substr(0, view_idx);
                    if(cloud_codes.find(letters) == cloud_codes.end())
                    {
                        decoded.append(decode_weather_obscurations(view));
                        break;
                    }
                    else
                    {
                        step = metar_decoding_step_e::sky_conditions;
                    }
                }
                case sky_conditions:
                {
                    bool is_temperature_dewpoint = false;
                    if(size_t divider = view.find('/'); divider != std::string_view::npos)
                    {
                        for(uint64_t numbers_start = divider + 1; numbers_start < view.size(); ++numbers_start)
                        {
                            if(view[numbers_start] >= '0' && view[numbers_start] <= '9')
                            {
                                is_temperature_dewpoint = true;
                                break;
                            }
                        }
                    }

                    if(!is_temperature_dewpoint)
                    {
                        decoded += decode_sky_conditions(view);
                        break;
                    }
                    else
                    {
                        step = metar_decoding_step_e::temperature_dewpoint;
                    }
                }
                case temperature_dewpoint:
                {
                    step = metar_decoding_step_e::air_pressure;
                    decoded += decode_temperature_dewpoint(view);
                    break;
                }
                case air_pressure:
                {
                    step = metar_decoding_step_e::remarks;

                    if(view[0] == 'Q')
                    {
                        decoded += decode_air_pressure(view);
                        break;
                    }
                }
                case remarks:
                {
                    decoded += decode_remarks(view);
                }
            }

            decoded.append("\n");
        }
    }

    return decoded;
}

extern "C" JNIEXPORT jstring JNICALL Java_com_example_flightnav_MainActivity_decode_1metar(JNIEnv *env, jobject thiz, jstring metar)
{
    jboolean is_copy = false;
    const char* chars = env->GetStringUTFChars(metar, &is_copy);

    std::string_view cstring{chars, size_t(env->GetStringLength(metar))};
    std::string decoded = decode_metar(cstring);

    return env->NewStringUTF(decoded.c_str());
}