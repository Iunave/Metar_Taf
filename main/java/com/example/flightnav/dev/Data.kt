package com.example.flightnav.dev

object DataHolder {
    val sampleMetar =
    "No errors\n" +
    "No warnings\n" +
    "131 ms\n" +
    "data source=metars\n" +
    "4981 results\n" +
    "raw_text,station_id,observation_time,latitude,longitude,temp_c,dewpoint_c,wind_dir_degrees,wind_speed_kt,wind_gust_kt,visibility_statute_mi,altim_in_hg,sea_level_pressure_mb,corrected,auto,auto_station,maintenance_indicator_on,no_signal,lightning_sensor_off,freezing_rain_sensor_off,present_weather_sensor_off,wx_string,sky_cover,cloud_base_ft_agl,sky_cover,cloud_base_ft_agl,sky_cover,cloud_base_ft_agl,sky_cover,cloud_base_ft_agl,flight_category,three_hr_pressure_tendency_mb,maxT_c,minT_c,maxT24hr_c,minT24hr_c,precip_in,pcp3hr_in,pcp6hr_in,pcp24hr_in,snow_in,vert_vis_ft,metar_type,elevation_m\n" +
    "CYGW 171128Z AUTO 11017G31KT 6SM HZ BKN100 BKN120 BKN150 16/13 A2938 RMK SLP952 DENSITY ALT 900FT,CYGW,2023-08-17T11:28:00Z,55.27,-77.77,16.0,13.0,110,17,31,6.0,29.379921,995.2,,TRUE,,,,,,,HZ,BKN,10000,BKN,12000,BKN,15000,,,VFR,,,,,,,,,,,,SPECI,13.0\n" +
    "KRKD 171127Z AUTO 09004KT 10SM BKN001 OVC015 17/17 A3008 RMK AO2,KRKD,2023-08-17T11:27:00Z,44.07,-69.1,17.0,17.0,90,4,,10.0,30.079725,,,TRUE,TRUE,,,,,,,BKN,100,OVC,1500,,,,,LIFR,,,,,,,,,,,,SPECI,15.0\n" +
    "KALB 171127Z 17009KT 10SM OVC013 22/19 A2999 RMK AO2 T02220194,KALB,2023-08-17T11:27:00Z,42.75,-73.8,22.2,19.4,170,9,,10.0,29.991142,,,,TRUE,,,,,,,OVC,1300,,,,,,,MVFR,,,,,,,,,,,,SPECI,82.0\n" +
    "KADF 171127Z AUTO 00000KT 4SM BR CLR 15/15 A2998 RMK AO2,KADF,2023-08-17T11:27:00Z,34.1,-93.07,15.0,15.0,0,0,,4.0,29.97933,,,TRUE,TRUE,,,,,,BR,CLR,,,,,,,,MVFR,,,,,,,,,,,,SPECI,54.0\n" +
    "CYCY 171127Z AUTO 12010KT 4SM BR SCT001 05/05 A2991 RMK SLP131,CYCY,2023-08-17T11:27:00Z,70.48,-68.52,5.0,5.0,120,10,,4.0,29.911417,1013.1,,TRUE,,,,,,,BR,SCT,100,,,,,,,MVFR,,,,,,,,,,,,SPECI,73.0\n" +
    "PAOH 171126Z AUTO 00000KT 10SM BKN028 BKN032 OVC046 11/09 A2998 RMK AO2 PNO \$,PAOH,2023-08-17T11:26:00Z,58.1,-135.45,11.0,9.0,0,0,,10.0,29.97933,,,TRUE,TRUE,TRUE,,,,,,BKN,2800,BKN,3200,OVC,4600,,,MVFR,,,,,,,,,,,,SPECI,0.0\n" +
    "KPVG 171126Z 2SM TS SCT055 BKN065 OVC100 A2997 RMK AO2 P0999 PWINO FZRANO RVRNO,KPVG,2023-08-17T11:26:00Z,36.78,-76.45,,,,,,2.0,29.970472,,,,TRUE,,,,TRUE,TRUE,TS,SCT,5500,BKN,6500,OVC,10000,,,IFR,,,,,,9.99,,,,,,SPECI,7.0\n" +
    "KPHD 171126Z AUTO 13004KT 1/4SM FG VV002 17/17 A2993 RMK AO2 T01720172 \$,KPHD,2023-08-17T11:26:00Z,40.47,-81.42,17.2,17.2,130,4,,0.25,29.929134,,,TRUE,TRUE,TRUE,,,,,FG,OVX,0,,,,,,,LIFR,,,,,,,,,,,200,SPECI,272.0\n" +
    "KOXR 171126Z AUTO 31004KT 1 3/4SM BR OVC002 17/17 A2985 RMK AO2 T01670167 \$,KOXR,2023-08-17T11:26:00Z,34.2,-119.2,16.7,16.7,310,4,,1.75,29.84941,,,TRUE,TRUE,TRUE,,,,,BR,OVC,200,,,,,,,LIFR,,,,,,,,,,,,SPECI,12.0\n" +
    "KNFE 171126Z AUTO 00000KT 1 1/2SM +RA BR FEW010 BKN031 OVC065 23/22 A2996 RMK AO2 TSE11 T02330217 PNO ,KNFE,2023-08-17T11:26:00Z,36.7,-76.13,23.3,21.7,0,0,,1.5,29.958662,,,TRUE,TRUE,,,,,,+RA BR,FEW,1000,BKN,3100,OVC,6500,,,IFR,,,,,,,,,,,,SPECI,4.0\n" +
    "KLVJ 171126Z AUTO 00000KT 1 3/4SM BR BKN002 24/23 A2994 RMK AO2 T02440233,KLVJ,2023-08-17T11:26:00Z,29.52,-95.25,24.4,23.3,0,0,,1.75,29.940945,,,TRUE,TRUE,,,,,,BR,BKN,200,,,,,,,LIFR,,,,,,,,,,,,SPECI,11.0\n" +
    "KBWG 171126Z AUTO 00000KT 1/4SM FG CLR 16/16 A2996 RMK AO2 T01610156,KBWG,2023-08-17T11:26:00Z,36.97,-86.42,16.1,15.6,0,0,,0.25,29.958662,,,TRUE,TRUE,,,,,,FG,CLR,,,,,,,,LIFR,,,,,,,,,,,,SPECI,159.0\n" +
    "KBLM 171126Z AUTO 00000KT 8SM OVC005 A2999 RMK AO2 CIG 002V007 FZRANO \$,KBLM,2023-08-17T11:26:00Z,40.17,-74.12,,,0,0,,8.0,29.991142,,,TRUE,TRUE,TRUE,,,TRUE,,,OVC,500,,,,,,,IFR,,,,,,,,,,,,SPECI,45.0\n" +
    "KAGC 171126Z 17005KT 2 1/2SM BR SCT002 OVC060 18/18 A2995 RMK AO2 T01830178,KAGC,2023-08-17T11:26:00Z,40.35,-79.92,18.3,17.8,170,5,,2.5,29.949802,,,,TRUE,,,,,,BR,SCT,200,OVC,6000,,,,,IFR,,,,,,,,,,,,SPECI,380.0\n" +
    "CYQA 171126Z AUTO 15008KT 6SM BR CLR 17/16 A2981 RMK SLP099 DENSITY ALT 1500FT,CYQA,2023-08-17T11:26:00Z,44.97,-79.3,17.0,16.0,150,8,,6.0,29.811024,1009.9,,TRUE,,,,,,,BR,CLR,,,,,,,,VFR,,,,,,,,,,,,SPECI,277.0\n" +
    "SUDU 171125Z 10013KT 6000 TSRA BKN006 FEW040CB 17/17 Q1010,SUDU,2023-08-17T11:25:00Z,-33.35,-56.5,17.0,17.0,100,13,,3.73,29.822834,,,,,,,,,,TSRA,BKN,600,FEW,4000,,,,,IFR,,,,,,,,,,,,METAR,91.0\n" +
    "OPLA 171125Z 27008KT 5000 FU SCT040 37/25 Q1001 NOSIG RMK QFE976 A29.58,OPLA,2023-08-17T11:25:00Z,31.52,74.4,37.0,25.0,270,8,,3.11,29.557087,,,,,,TRUE,,,,FU,SCT,4000,,,,,,,MVFR,,,,,,,,,,,,SPECI,217.0\n" +
    "KSMO 171125Z AUTO 13003KT 1SM BR OVC002 18/17 A2985 RMK AO2 VIS 3/4V1 3/4 T01780167,KSMO,2023-08-17T11:25:00Z,34.02,-118.45,17.8,16.7,130,3,,1.0,29.84941,,,TRUE,TRUE,,,,,,BR,OVC,200,,,,,,,LIFR,,,,,,,,,,,,SPECI,56.0\n" +
    "KLOZ 171125Z AUTO 00000KT 1/4SM FG VV002 16/16 A2998 RMK AO2 T01560156,KLOZ,2023-08-17T11:25:00Z,37.08,-84.07,15.6,15.6,0,0,,0.25,29.97933,,,TRUE,TRUE,,,,,,FG,OVX,0,,,,,,,LIFR,,,,,,,,,,,200,SPECI,361.0\n" +
    "KJAX 171125Z 22005KT 3SM BR BKN004 BKN100 BKN250 24/22 A2993 RMK AO2 T02390222 \$,KJAX,2023-08-17T11:25:00Z,30.5,-81.68,23.9,22.2,220,5,,3.0,29.929134,,,,TRUE,TRUE,,,,,BR,BKN,400,BKN,10000,BKN,25000,,,LIFR,,,,,,,,,,,,SPECI,8.0\n" +
    "KIMT 171125Z AUTO 30005KT 10SM FEW012 SCT024 BKN095 17/16 A2950 RMK AO2 T01720156,KIMT,2023-08-17T11:25:00Z,45.82,-88.12,17.2,15.6,300,5,,10.0,29.500984,,,TRUE,TRUE,,,,,,,FEW,1200,SCT,2400,BKN,9500,,,VFR,,,,,,,,,,,,SPECI,343.0\n" +
    "KILN 171125Z AUTO 20005KT 3SM BR CLR 17/16 A2993 RMK AO2 T01670156,KILN,2023-08-17T11:25:00Z,39.43,-83.8,16.7,15.6,200,5,,3.0,29.929134,,,TRUE,TRUE,,,,,,BR,CLR,,,,,,,,MVFR,,,,,,,,,,,,SPECI,325.0\n" +
    "KIKT 171125Z AUTO 20012KT 10SM 29/26 A2992 RMK A01,KIKT,2023-08-17T11:25:00Z,28.52,-88.28,29.0,26.0,200,12,,10.0,29.920275,,,TRUE,TRUE,,,,,,,,,,,,,,,,,,,,,,,,,,,SPECI,36.0\n" +
    "KHLG 171125Z 19004KT 2SM BR SCT002 17/17 A2995 RMK AO2 T01720167,KHLG,2023-08-17T11:25:00Z,40.17,-80.65,17.2,16.7,190,4,,2.0,29.949802,,,,TRUE,,,,,,BR,SCT,200,,,,,,,IFR,,,,,,,,,,,,SPECI,365.0\n" +
    "KGLH 171125Z 00000KT 1 1/4SM BR CLR 16/16 A2996 RMK AO2 VIS 1/2V3 T01560156,KGLH,2023-08-17T11:25:00Z,33.47,-90.98,15.6,15.6,0,0,,1.25,29.958662,,,,TRUE,,,,,,BR,CLR,,,,,,,,IFR,,,,,,,,,,,,SPECI,40.0"

    val sampleTaf =
    "No errors\n" +
    "No warnings\n" +
    "310 ms\n" +
    "data source=tafs\n" +
    "2016 results\n" +
    "raw_text,station_id,issue_time,bulletin_time,valid_time_from,valid_time_to,remarks,latitude,longitude,elevation_m,fcst_time_from,fcst_time_to,change_indicator,time_becoming,probability,wind_dir_degrees,wind_speed_kt,wind_gust_kt,wind_shear_hgt_ft_agl,wind_shear_dir_degrees,wind_shear_speed_kt,visibility_statute_mi,altim_in_hg,vert_vis_ft,wx_string,not_decoded,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,turbulence_intensity,turbulence_min_alt_ft_agl,turbulence_max_alt_ft_agl,icing_intensity,icing_min_alt_ft_agl,icing_max_alt_ft_agl,valid_time,sfc_temp_c,max_or_min_temp_c,valid_time,sfc_temp_c,max_or_min_temp_c,fcst_time_from,fcst_time_to,change_indicator,time_becoming,probability,wind_dir_degrees,wind_speed_kt,wind_gust_kt,wind_shear_hgt_ft_agl,wind_shear_dir_degrees,wind_shear_speed_kt,visibility_statute_mi,altim_in_hg,vert_vis_ft,wx_string,not_decoded,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,turbulence_intensity,turbulence_min_alt_ft_agl,turbulence_max_alt_ft_agl,icing_intensity,icing_min_alt_ft_agl,icing_max_alt_ft_agl,valid_time,sfc_temp_c,max_or_min_temp_c,valid_time,sfc_temp_c,max_or_min_temp_c,fcst_time_from,fcst_time_to,change_indicator,time_becoming,probability,wind_dir_degrees,wind_speed_kt,wind_gust_kt,wind_shear_hgt_ft_agl,wind_shear_dir_degrees,wind_shear_speed_kt,visibility_statute_mi,altim_in_hg,vert_vis_ft,wx_string,not_decoded,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,turbulence_intensity,turbulence_min_alt_ft_agl,turbulence_max_alt_ft_agl,icing_intensity,icing_min_alt_ft_agl,icing_max_alt_ft_agl,valid_time,sfc_temp_c,max_or_min_temp_c,valid_time,sfc_temp_c,max_or_min_temp_c,fcst_time_from,fcst_time_to,change_indicator,time_becoming,probability,wind_dir_degrees,wind_speed_kt,wind_gust_kt,wind_shear_hgt_ft_agl,wind_shear_dir_degrees,wind_shear_speed_kt,visibility_statute_mi,altim_in_hg,vert_vis_ft,wx_string,not_decoded,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,turbulence_intensity,turbulence_min_alt_ft_agl,turbulence_max_alt_ft_agl,icing_intensity,icing_min_alt_ft_agl,icing_max_alt_ft_agl,valid_time,sfc_temp_c,max_or_min_temp_c,valid_time,sfc_temp_c,max_or_min_temp_c,fcst_time_from,fcst_time_to,change_indicator,time_becoming,probability,wind_dir_degrees,wind_speed_kt,wind_gust_kt,wind_shear_hgt_ft_agl,wind_shear_dir_degrees,wind_shear_speed_kt,visibility_statute_mi,altim_in_hg,vert_vis_ft,wx_string,not_decoded,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,turbulence_intensity,turbulence_min_alt_ft_agl,turbulence_max_alt_ft_agl,icing_intensity,icing_min_alt_ft_agl,icing_max_alt_ft_agl,valid_time,sfc_temp_c,max_or_min_temp_c,valid_time,sfc_temp_c,max_or_min_temp_c,fcst_time_from,fcst_time_to,change_indicator,time_becoming,probability,wind_dir_degrees,wind_speed_kt,wind_gust_kt,wind_shear_hgt_ft_agl,wind_shear_dir_degrees,wind_shear_speed_kt,visibility_statute_mi,altim_in_hg,vert_vis_ft,wx_string,not_decoded,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,turbulence_intensity,turbulence_min_alt_ft_agl,turbulence_max_alt_ft_agl,icing_intensity,icing_min_alt_ft_agl,icing_max_alt_ft_agl,valid_time,sfc_temp_c,max_or_min_temp_c,valid_time,sfc_temp_c,max_or_min_temp_c,fcst_time_from,fcst_time_to,change_indicator,time_becoming,probability,wind_dir_degrees,wind_speed_kt,wind_gust_kt,wind_shear_hgt_ft_agl,wind_shear_dir_degrees,wind_shear_speed_kt,visibility_statute_mi,altim_in_hg,vert_vis_ft,wx_string,not_decoded,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,turbulence_intensity,turbulence_min_alt_ft_agl,turbulence_max_alt_ft_agl,icing_intensity,icing_min_alt_ft_agl,icing_max_alt_ft_agl,valid_time,sfc_temp_c,max_or_min_temp_c,valid_time,sfc_temp_c,max_or_min_temp_c,fcst_time_from,fcst_time_to,change_indicator,time_becoming,probability,wind_dir_degrees,wind_speed_kt,wind_gust_kt,wind_shear_hgt_ft_agl,wind_shear_dir_degrees,wind_shear_speed_kt,visibility_statute_mi,altim_in_hg,vert_vis_ft,wx_string,not_decoded,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,sky_cover,cloud_base_ft_agl,cloud_type,turbulence_intensity,turbulence_min_alt_ft_agl,turbulence_max_alt_ft_agl,icing_intensity,icing_min_alt_ft_agl,icing_max_alt_ft_agl,valid_time,sfc_temp_c,max_or_min_temp_c,valid_time,sfc_temp_c,max_or_min_temp_c,\n" +
    "KJAC 201114Z 2011/2106 02005KT P6SM SCT080 BKN100 TEMPO 2011/2013 BKN001 FM201300 01007KT P6SM -SHRA SCT060 BKN090 FM201900 23015G25KT P6SM VCSH FEW090 SCT120 FM210200 02006KT P6SM SCT120,KJAC,2023-08-20T11:14:00Z,2023-08-20T11:14:00Z,2023-08-20T11:00:00Z,2023-08-21T06:00:00Z,AMD,43.62,-110.73,1967.0,2023-08-20T11:00:00Z,2023-08-20T13:00:00Z,,,,20,5,,,,,6.21,,,,,SCT,8000,,BKN,10000,,,,,,,,,,,,,,,,,2023-08-20T11:00:00Z,2023-08-20T13:00:00Z,TEMPO,,,,,,,,,,,,,,BKN,100,,,,,,,,,,,,,,,,,,,,2023-08-20T13:00:00Z,2023-08-20T19:00:00Z,FM,,,10,7,,,,,6.21,,,-SHRA,,SCT,6000,,BKN,9000,,,,,,,,,,,,,,,,,2023-08-20T19:00:00Z,2023-08-21T02:00:00Z,FM,,,230,15,25,,,,6.21,,,VCSH,,FEW,9000,,SCT,12000,,,,,,,,,,,,,,,,,2023-08-21T02:00:00Z,2023-08-21T06:00:00Z,FM,,,20,6,,,,,6.21,,,,,SCT,12000,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n" +
    "TAF AMD CYPX 201109Z 2011/2018 24012G22KT 6SM BR OVC006 TEMPO 2011/2016 1SM -RA BR OVC002 PROB40 2012/2014 1/2SM FG FM201600 28020G30KT P6SM BKN025 TEMPO 2016/2018 5SM -RA BR OVC008 RMK FCST BASED ON AUTO OBS. NXT FCST BY 201200Z,CYPX,2023-08-20T11:09:00Z,2023-08-20T05:00:00Z,2023-08-20T11:00:00Z,2023-08-20T18:00:00Z,RMK FCST BASED ON AUTO OBS. NXT FCST BY 201200Z,60.03,-77.27,10.0,2023-08-20T11:00:00Z,2023-08-20T16:00:00Z,,,,240,12,22,,,,6.0,,,BR,,OVC,600,,,,,,,,,,,,,,,,,,,,2023-08-20T11:00:00Z,2023-08-20T16:00:00Z,TEMPO,,,,,,,,,1.0,,,-RA BR,,OVC,200,,,,,,,,,,,,,,,,,,,,2023-08-20T12:00:00Z,2023-08-20T14:00:00Z,PROB,,40,,,,,,,0.5,,,FG,,,,,,,,,,,,,,,,,,,,,,,2023-08-20T16:00:00Z,2023-08-20T18:00:00Z,FM,,,280,20,30,,,,6.21,,,,,BKN,2500,,,,,,,,,,,,,,,,,,,,2023-08-20T16:00:00Z,2023-08-20T18:00:00Z,TEMPO,,,,,,,,,5.0,,,-RA BR,,OVC,800,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n" +
    "KATY 201106Z 2011/2106 01009KT P6SM SKC FM201500 05010G18KT P6SM SCT240 FM202300 06009KT P6SM SCT130 BKN250,KATY,2023-08-20T11:06:00Z,2023-08-20T11:06:00Z,2023-08-20T11:00:00Z,2023-08-21T06:00:00Z,AMD,44.9,-97.15,531.0,2023-08-20T11:00:00Z,2023-08-20T15:00:00Z,,,,10,9,,,,,6.21,,,,,SKC,,,,,,,,,,,,,,,,,,,,,2023-08-20T15:00:00Z,2023-08-20T23:00:00Z,FM,,,50,10,18,,,,6.21,,,,,SCT,24000,,,,,,,,,,,,,,,,,,,,2023-08-20T23:00:00Z,2023-08-21T06:00:00Z,FM,,,60,9,,,,,6.21,,,,,SCT,13000,,BKN,25000,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n" +
    "TAF AMD ESGG 201104Z 2011/2109 20006KT 2000 BR BKN003 BECMG 2011/2013 8000 NSW BKN010 BECMG 2013/2015 SCT015 BECMG 2020/2023 0300 FG VV002 PROB40 2023/2105 4000 BR NSC BECMG 2105/2107 9999 NSW SCT010 TEMPO 2107/2109 BKN010,ESGG,2023-08-20T11:04:00Z,2023-08-20T08:00:00Z,2023-08-20T11:00:00Z,2023-08-21T09:00:00Z,,57.67,12.3,152.0,2023-08-20T11:00:00Z,2023-08-21T09:00:00Z,,,,200,6,,,,,1.24,,,BR,,BKN,300,,,,,,,,,,,,,,,,,,,,2023-08-20T11:00:00Z,2023-08-20T13:00:00Z,BECMG,2023-08-20T13:00:00Z,,200,6,,,,,4.97,,,NSW,,BKN,1000,,,,,,,,,,,,,,,,,,,,2023-08-20T13:00:00Z,2023-08-20T20:00:00Z,BECMG,2023-08-20T15:00:00Z,,200,6,,,,,4.97,,,NSW,,SCT,1500,,,,,,,,,,,,,,,,,,,,2023-08-20T20:00:00Z,2023-08-21T05:00:00Z,BECMG,2023-08-20T23:00:00Z,,200,6,,,,,0.19,,200,FG,,OVX,,,,,,,,,,,,,,,,,,,,,2023-08-20T23:00:00Z,2023-08-21T05:00:00Z,PROB,,40,,,,,,,2.49,,,BR,,NSC,,,,,,,,,,,,,,,,,,,,,2023-08-21T05:00:00Z,2023-08-21T09:00:00Z,BECMG,2023-08-21T07:00:00Z,,200,6,,,,,6.21,,200,NSW,,SCT,1000,,,,,,,,,,,,,,,,,,,,2023-08-21T07:00:00Z,2023-08-21T09:00:00Z,TEMPO,,,,,,,,,,,,,,BKN,1000,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n" +
    "TAF AMD CYUL 201103Z 2011/2106 25012KT P6SM FEW150 BKN250 FM210000 23012KT P6SM BKN060 RMK NXT FCST BY 201200Z,CYUL,2023-08-20T11:03:00Z,2023-08-20T08:00:00Z,2023-08-20T11:00:00Z,2023-08-21T06:00:00Z,RMK NXT FCST BY 201200Z,45.47,-73.73,31.0,2023-08-20T11:00:00Z,2023-08-21T00:00:00Z,,,,250,12,,,,,6.21,,,,,FEW,15000,,BKN,25000,,,,,,,,,,,,,,,,,2023-08-21T00:00:00Z,2023-08-21T06:00:00Z,FM,,,230,12,,,,,6.21,,,,,BKN,6000,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n" +
    "KHVR 201103Z 2011/2106 07016KT P6SM SCT070 BKN120 FM201600 11014G20KT P6SM SCT030 BKN060 FM210100 10015KT P6SM SCT030 BKN060,KHVR,2023-08-20T11:03:00Z,2023-08-20T11:03:00Z,2023-08-20T11:00:00Z,2023-08-21T06:00:00Z,AMD,48.55,-109.77,789.0,2023-08-20T11:00:00Z,2023-08-20T16:00:00Z,,,,70,16,,,,,6.21,,,,,SCT,7000,,BKN,12000,,,,,,,,,,,,,,,,,2023-08-20T16:00:00Z,2023-08-21T01:00:00Z,FM,,,110,14,20,,,,6.21,,,,,SCT,3000,,BKN,6000,,,,,,,,,,,,,,,,,2023-08-21T01:00:00Z,2023-08-21T06:00:00Z,FM,,,100,15,,,,,6.21,,,,,SCT,3000,,BKN,6000,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n" +
    "KLEB 201102Z 2011/2106 VRB03KT P6SM FEW250 TEMPO 2011/2012 6SM BR SCT001 FM201200 25008KT P6SM FEW045 FEW250 FM202300 19004KT P6SM FEW250,KLEB,2023-08-20T11:02:00Z,2023-08-20T11:02:00Z,2023-08-20T11:00:00Z,2023-08-21T06:00:00Z,AMD,43.63,-72.3,169.0,2023-08-20T11:00:00Z,2023-08-20T12:00:00Z,,,,0,3,,,,,6.21,,,,,FEW,25000,,,,,,,,,,,,,,,,,,,,2023-08-20T11:00:00Z,2023-08-20T12:00:00Z,TEMPO,,,,,,,,,6.0,,,BR,,SCT,100,,,,,,,,,,,,,,,,,,,,2023-08-20T12:00:00Z,2023-08-20T23:00:00Z,FM,,,250,8,,,,,6.21,,,,,FEW,4500,,FEW,25000,,,,,,,,,,,,,,,,,2023-08-20T23:00:00Z,2023-08-21T06:00:00Z,FM,,,190,4,,,,,6.21,,,,,FEW,25000,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n"

    //e: java.lang.RuntimeException: Error generating class file com/example/flightnav/DataHolder.class (compiled from [/home/user/Programs/AndroidStudioProjects/fnav/app/src/main/java/com/example/flightnav/Data.kt]): Method too large: com/example/flightnav/DataHolder.<clinit> ()V
}

