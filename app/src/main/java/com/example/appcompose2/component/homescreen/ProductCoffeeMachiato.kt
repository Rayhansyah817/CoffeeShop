package com.example.appcompose2.component.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcompose2.R
import com.example.appcompose2.ui.theme.AppCompose2Theme
import com.example.appcompose2.ui.theme.Brown

@Preview
@Composable
fun MachiatoCoffePreview() {
    AppCompose2Theme {
        MachiatoCoffe()
    }
}

@Composable
fun MachiatoCoffe() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .width(340.dp)
//                .size(340.dp, 400.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopCenter)

        ) {
            Row {
                Box(
                    modifier = Modifier
                        .size(150.dp, 240.dp)
                        .padding(0.dp, 0.dp, 10.dp, 0.dp)
                ) {
                    Column {
                        val image = painterResource(R.drawable.cappuccino1)
                        Image(
                            painter = image,
                            contentDescription = null,
                            modifier = Modifier
                                .size(141.dp, 132.dp)

                        )
                        Text(
                            text = "Machiato",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "with Chocolate",
                            color = Color.Black,
                            fontSize = 14.sp
                        )
                        Row {
                            Text(
                                text = "$4.53",
                                fontSize = 22.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(0.dp, 0.dp, 30.dp, 0.dp)
                            )
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .background(Brown, RoundedCornerShape(10.dp))
                                    .size(40.dp)
                            ) {
                                val plus = painterResource(R.drawable.ic_plus)
                                Image(
                                    painter = plus,
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .size(24.dp)
                                )
                            }
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .size(150.dp, 240.dp)
                        .padding(10.dp, 0.dp, 0.dp, 0.dp)
                ) {
                    Column {
                        val image = painterResource(R.drawable.cappuccino2)
                        Image(
                            painter = image,
                            contentDescription = null,
                            modifier = Modifier
                                .size(141.dp, 132.dp)

                        )
                        Text(
                            text = "Machiato",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "with Oat Milk",
                            color = Color.Black,
                            fontSize = 14.sp
                        )
                        Row {
                            Text(
                                text = "$3.90",
                                fontSize = 22.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(0.dp, 0.dp, 30.dp, 0.dp)
                            )
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .background(Brown, RoundedCornerShape(10.dp))
                                    .size(40.dp)
                            ) {
                                val plus = painterResource(R.drawable.ic_plus)
                                Image(
                                    painter = plus,
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .size(24.dp)
                                )
                            }
                        }
                    }

                }
            }

            Row {
                Box(
                    modifier = Modifier
                        .size(150.dp, 240.dp)
                        .padding(0.dp, 0.dp, 10.dp, 0.dp)
                ) {
                    Column {
                        val image = painterResource(R.drawable.cappuccino3)
                        Image(
                            painter = image,
                            contentDescription = null,
                            modifier = Modifier
                                .size(141.dp, 132.dp)

                        )
                        Text(
                            text = "Machiato",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "with Chocolate",
                            color = Color.Black,
                            fontSize = 14.sp
                        )
                        Row {
                            Text(
                                text = "$4.53",
                                fontSize = 22.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(0.dp, 0.dp, 30.dp, 0.dp)
                            )
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .background(Brown, RoundedCornerShape(10.dp))
                                    .size(40.dp)
                            ) {
                                val plus = painterResource(R.drawable.ic_plus)
                                Image(
                                    painter = plus,
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .size(24.dp)
                                )
                            }
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .size(150.dp, 240.dp)
                        .padding(10.dp, 0.dp, 0.dp, 0.dp)
                ) {
                    Column {
                        val image = painterResource(R.drawable.cappuccino4)
                        Image(
                            painter = image,
                            contentDescription = null,
                            modifier = Modifier
                                .size(141.dp, 132.dp)
                        )
                        Text(
                            text = "Machiato",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "with Oat Milk",
                            color = Color.Black,
                            fontSize = 14.sp
                        )
                        Row {
                            Text(
                                text = "$3.90",
                                fontSize = 22.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(0.dp, 0.dp, 30.dp, 0.dp)
                            )
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .background(Brown, RoundedCornerShape(10.dp))
                                    .size(40.dp)
                            ) {
                                val plus = painterResource(R.drawable.ic_plus)
                                Image(
                                    painter = plus,
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .size(24.dp)
                                )
                            }
                        }
                    }

                }
            }

        }
    }
}