package com.kendev.choosetech

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kendev.choosetech.sealed.Screen

@Composable
    fun ResultScreen(navController: NavController){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ){
            Button(
                onClick = { navController.navigate(Screen.MainScreen.route) },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color( 30, 111, 217)
                )
            ) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBack,
                    contentDescription = "Selected",
                    tint = Color( 242,242,242),
                    modifier = Modifier.size(20.dp)
                )
                Text(
                    "Back",
                    color = Color(242, 242, 242)
                )
            }
        }

    }