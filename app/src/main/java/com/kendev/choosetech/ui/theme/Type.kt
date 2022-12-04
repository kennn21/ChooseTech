package com.kendev.choosetech.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kendev.choosetech.R

// Set of Material typography styles to start with
val ageo: FontFamily = FontFamily(
    Font(R.font.ageo),
    Font(R.font.ageobold,weight = FontWeight.Bold),
    Font(R.font.ageoextrabold, weight = FontWeight.ExtraBold),
    Font(R.font.ageolight, weight = FontWeight.Light),
    Font(R.font.ageomedium, weight = FontWeight.Medium),
    Font(R.font.ageothin, weight = FontWeight.Thin),
    Font(R.font.ageosemibold, weight = FontWeight.SemiBold)
)

val roboto: FontFamily = FontFamily(
    Font(R.font.roboto),
    Font(R.font.robotobold,weight = FontWeight.Bold),
    Font(R.font.robotoblack, weight = FontWeight.ExtraBold),
    Font(R.font.robotolight, weight = FontWeight.Light),
    Font(R.font.robotomedium, weight = FontWeight.Medium),
    Font(R.font.robotolight, weight = FontWeight.Thin),
    Font(R.font.robotomedium, weight = FontWeight.SemiBold)
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = ageo,
        fontWeight = FontWeight.Bold,
        fontSize = 42.sp
    ),
    h2 = TextStyle(
        fontFamily = ageo,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    )
)