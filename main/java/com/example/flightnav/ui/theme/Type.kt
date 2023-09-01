package com.example.flightnav.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.flightnav.R

private val UbuntuBold = FontFamily(Font(R.font.ubuntu_bold))
private val UbuntuRegular = FontFamily(Font(R.font.ubuntu_regular))

// Set of Material typography styles to start with
val typography = Typography(
        displaySmall = TextStyle(
                fontFamily = UbuntuRegular,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp
        ),
        bodyLarge = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp
        ),
        displayMedium = TextStyle(
                fontFamily = UbuntuBold,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp
        )
)