package com.example.firebasestorage.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_DASHBOARD
import com.example.firebasestorage.navigation.ROUT_LOGIN
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController){
    Column (modifier =Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){


        val coroutine= rememberCoroutineScope()
        coroutine.launch {
            delay(1000)
            navController.navigate(ROUT_LOGIN)
        }

        Image(painter = painterResource(id = R.drawable.estate),
            contentDescription = "esto",
            modifier =Modifier.size(200.dp)
        )
      Text(text = "Shopies",
          fontSize = 40.sp,
          fontFamily = FontFamily.Cursive,
          fontWeight = FontWeight.Bold,
          modifier = Modifier.padding(20.dp))
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashScreen(){
    SplashScreen(rememberNavController())
}