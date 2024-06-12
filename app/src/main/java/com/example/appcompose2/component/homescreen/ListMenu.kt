package com.example.appcompose2.component.homescreen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcompose2.ui.theme.Brown

@Preview
@Composable
fun ListMenuPreview() {
    ListMenu("Cappuccino") {}
}

@Composable
fun ListMenu(selectedButton: String, onButtonSelected: (String) -> Unit) {

//    var isSelected by remember { mutableStateOf(false) }



    Box(
        modifier = Modifier
            .height(55.dp)
            .width(340.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
        ) {
            Button(
                onClick = {
                    onButtonSelected("Cappuccino")
                },
//                enabled = if ,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Brown,
                    contentColor = Color.White,
                    disabledContainerColor = Color.White,
                    disabledContentColor = Color.Black


                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .height(40.dp)
                    .wrapContentWidth()
            ) {
                Text(
                    text = "Cappuccino",
                    fontSize = 14.sp,
                    color = Color.White
                )
            }
            Button(
                onClick = {
                    onButtonSelected("Machiato")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Brown,
                    contentColor = Color.White,
                    disabledContainerColor = Color.White,
                    disabledContentColor = Color.Black
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .height(40.dp)
                    .wrapContentWidth()
                    .padding(10.dp, 0.dp, 0.dp, 0.dp)
            ) {
                Text(
                    text = "Machiato",
                    fontSize = 14.sp
                )
            }
            Button(
                onClick = {
                    onButtonSelected("Latte")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Brown,
                    contentColor = Color.White,
                    disabledContainerColor = Color.White,
                    disabledContentColor = Color.Black
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .height(40.dp)
                    .wrapContentWidth()
                    .padding(10.dp, 0.dp, 0.dp, 0.dp)
            ) {
                Text(
                    text = "Latte",
                    fontSize = 14.sp
                )
            }
            Button(
                onClick = {
                    onButtonSelected("Americano")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Brown,
                    contentColor = Color.White,
                    disabledContainerColor = Color.White,
                    disabledContentColor = Color.Black
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .height(40.dp)
                    .wrapContentWidth()
                    .padding(10.dp, 0.dp, 0.dp, 0.dp)
            ) {
                Text(
                    text = "Americano",
                    fontSize = 14.sp
                )
            }
        }
    }
}