package com.example.firebasestorage.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.ui.theme.screens.about.AboutScreen
import com.example.firebasestorage.ui.theme.screens.beauty.BeautyScreen
import com.example.firebasestorage.ui.theme.screens.clothing.ClothinScreen
import com.example.firebasestorage.ui.theme.screens.dashboard.DashboardScreen
import com.example.firebasestorage.ui.theme.screens.electronic.ElectronicScreen
import com.example.firebasestorage.ui.theme.screens.groceries.GroceriesScreen
import com.example.firebasestorage.ui.theme.screens.home.HomeScreen
import com.example.firebasestorage.ui.theme.screens.login.LoginScreen
import com.example.firebasestorage.ui.theme.screens.pharmacy.PharmacyScreen
import com.example.firebasestorage.ui.theme.screens.services.ServicesScreen
import com.example.firebasestorage.ui.theme.screens.signup.SignupScreen
import com.example.firebasestorage.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_SPLASH) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }



        composable(ROUT_DASHBOARD){
            DashboardScreen(navController)
        }

        composable(ROUT_ABOUT){
            AboutScreen(navController)
        }

        composable(ROUT_SPLASH){
            SplashScreen(navController)
        }

        composable(ROUT_SERVICES){
            ServicesScreen(navController)
        }

        composable(ROUT_CLOTHING){
            ClothinScreen(navController)
        }
        composable(ROUT_ELECTRONIC){
            ElectronicScreen(navController)
        }
        composable(ROUT_BEAUTY){
            BeautyScreen(navController)
        }
        composable(ROUT_PHARMACY){
            PharmacyScreen(navController)
        }
        composable(ROUT_GROCERIES){
            GroceriesScreen(navController)
        }
    }
}