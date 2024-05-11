package com.example.firebasestorage.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.data.AuthViewModel
import com.example.firebasestorage.navigation.ROUT_DASHBOARD
import com.example.firebasestorage.navigation.ROUT_SIGNUP
import com.example.firebasestorage.ui.theme.lBlue
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.Color
import com.example.firebasestorage.R

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .padding(top = 5.dp)
        .background(color = Color.LightGray)
        .fillMaxSize()
        .paint(
            painterResource(id =R.drawable.back1),
            contentScale = ContentScale.FillBounds
        ),
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {
        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Welcome",
            fontSize = 60.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive)

        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current


        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Email Address",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = email , onValueChange = {email=it},
            placeholder = { Text(text = "Email Address", fontFamily = FontFamily.Serif)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp),
            trailingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = Color.Black)
            }
        )




        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Password",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

        OutlinedTextField(value = password , onValueChange = {password=it},
            placeholder = { Text(text = "Password", fontFamily = FontFamily.Serif)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp),
            trailingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Color.Black)
            },
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navController.navigate(ROUT_DASHBOARD)
            // HANDLE LOGIN LOGIC //
            var xyz = AuthViewModel(navController, context)
            xyz.login(email.text,password.text)

        }, colors = ButtonDefaults.buttonColors(lBlue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp),) {
            Text(text = "Login")
        }

        Button(onClick = {
            navController.navigate(ROUT_SIGNUP)
        }, colors = ButtonDefaults.buttonColors(lBlue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp),) {
            Text(text = "Don't have account? SignUp")
        }


        Text(text = "Continue as guest",
            fontSize = 20.sp,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.clickable {
                navController.navigate(ROUT_DASHBOARD)

            })

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}