package com.example.firebasestorage.ui.theme.screens.clothing

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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

@Composable
fun ClothinScreen(navController: NavHostController) {
    val mContext = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Image(painter = painterResource(id = R.drawable.clo1),
                contentDescription ="madola",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = "Reagan Collection",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "quality",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
        }
        //end of Box
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(start = 20.dp)
        ) {

            //Row 1
            Row (){
                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.clo2),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Denim",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.3000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

                Spacer(modifier = Modifier.width(50.dp))

                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.clo1),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Suits",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.6000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

            }
            //End of Row 1

            Spacer(modifier = Modifier.height(20.dp))

            //Row 1
            Row (){
                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.clo3),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Jumper",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.3000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

                Spacer(modifier = Modifier.width(50.dp))

                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.clo1),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Suits",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.6000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

            }
            //End of Row 1

            Spacer(modifier = Modifier.height(20.dp))

            //Row 1
            Row (){
                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            val mContext= LocalContext.current
                            Image(
                                painter = painterResource(id = R.drawable.clothing),
                                contentDescription = "car",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clickable {
                                               Toast.makeText(mContext,"Clicked on main image",
                                                   Toast.LENGTH_LONG).show()
                                    },

                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "T-Shirt",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.3000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

                Spacer(modifier = Modifier.width(50.dp))

                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.clo3),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Suits",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.6000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

            }
            //End of Row 1

            Spacer(modifier = Modifier.height(20.dp))

            //Row 1
            Row (){
                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.clo2),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Denim",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.3000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

                Spacer(modifier = Modifier.width(50.dp))

                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.clo1),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Suits",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.6000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

            }
            //End of Row 1
        }


    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ClothingScreenPreview() {
    ClothinScreen(rememberNavController())
}