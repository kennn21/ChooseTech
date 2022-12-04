package com.kendev.choosetech

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.kendev.choosetech.model.ListItem
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kendev.choosetech.sealed.Screen
import com.kendev.choosetech.ui.theme.ChooseTechTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChooseTechTheme {
                Surface(
                    color = Color(242, 242, 242),
                    modifier = Modifier.fillMaxSize()
                ) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun MainScreen(navController: NavController){

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier
                .padding(10.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Column(){
                    Row(){
                        Text(
                            text = "Choose",
                            style = MaterialTheme.typography.h1,
                            color = Color( 30, 111, 217)
                        )
                    }
                    Row(){
                        Text(
                            text = "your activities",
                            style = MaterialTheme.typography.h2
                        )
                    }
                }

            }
            Row(
                modifier = Modifier
                    .padding(10.dp)
            ){
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .requiredHeight(400.dp)
                ){

                    Card(
                        border = BorderStroke(2.dp,Color(92, 157, 242)),
                        backgroundColor = Color(242, 242, 242),
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        MultiSelectList()
                    }
                }
            }
            Row(
                modifier = Modifier.padding(10.dp)
            ){
                Button(
                    onClick = { navController.navigate(Screen.ResultScreen.route) },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color( 30, 111, 217)
                    )
                ) {
                    Text(
                        "Next",
                        color = Color(242, 242, 242)
                    )
                }
            }
        }
    }
}

@Composable
fun MultiSelectList(
    modifier: Modifier = Modifier
){
    var items by remember {
        mutableStateOf(
            (1..20).map{
                ListItem(
                    title = "Item $it",
                    isSelected = false
                )
            }
        )
    }

    var selectedItems = items.filter { it.isSelected }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
    ){
        items(items.size){i->
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .clickable {
                        items = items.mapIndexed { j, item ->
                            if (i == j) {
                                item.copy(isSelected = !item.isSelected)
                            } else item
                        }
                    }
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = items[i].title)
                if(items[i].isSelected){
                    Icon(
                        imageVector = Icons.Rounded.Check,
                        contentDescription = "Selected",
                        tint = Color( 30, 111, 217),
                        modifier = modifier.size(20.dp)
                    )
                }
            }
        }
    }
}