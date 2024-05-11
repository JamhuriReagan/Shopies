package com.example.firebasestorage.ui.theme.screens.home

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_ABOUT
import com.example.firebasestorage.navigation.ROUT_SIGNUP

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController) {

    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(title = { Text(text = "Destination", color = Color.White) } ,
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.DarkGray),
            navigationIcon = {
                IconButton(onClick = {   }) {
                    Icon(imageVector = Icons.Default.ArrowBack ,
                        contentDescription ="ArrowBack", tint = Color.White )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Add
                        , contentDescription = "Add",
                        tint = Color.White)

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings
                        , contentDescription = "settings",
                        tint = Color.White)

                }
            })
        //END OF TopAppBar

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(id = R.drawable.clothing) ,
                contentDescription ="madola",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Clothings",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
        //end of Box
        Spacer(modifier = Modifier.height(10.dp))

        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value =search ,
            onValueChange = { search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            placeholder = { Text(text = "Whats your next Destination") },
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription ="Search" ) }
        )
        //end of search bar

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Recently viewed",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(start=20.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

            //CARD 1
            Card (
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ){

                Column {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.beauty) ,
                            contentDescription = "new york",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "beauty",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }

            }
            //END OF CARD 1
            Spacer(modifier = Modifier.width(10.dp))

            //CARD 2
            Card (
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ){

                Column {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.pharm1) ,
                            contentDescription = "new york",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Pharmacy",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }

            }
            //END OF CARD 2
            Spacer(modifier = Modifier.width(10.dp))

            //CARD 3
            Card (
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ){

                Column {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.ele1) ,
                            contentDescription = "new york",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "electric",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }

            }
            //END OF CARD 3
            Spacer(modifier = Modifier.width(10.dp))


            //CARD 4
            Card (
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ){

                Column {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.gro2) ,
                            contentDescription = "Groceries",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "London",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }

            }
            //END OF CARD 4

        }
        //END OF ROW 1

        Button(onClick = { navController.navigate(ROUT_ABOUT) },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),) {
            Text(text = "Next")

        }




    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}