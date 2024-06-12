package com.example.appcompose2.component.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcompose2.R
import com.example.appcompose2.ui.theme.Brown

@Preview
@Composable
fun SearchBarPreview() {
    SearchBar()
}

@Composable
fun SearchBar() {
    Box(
        modifier = Modifier
            .padding(0.dp, 20.dp, 0.dp, 15.dp)
            .height(55.dp)
            .width(340.dp)
            .background(color = Color.Black, shape = RoundedCornerShape(5.dp))
            .border(
                width = 2.dp,
                color = Color.White,
                shape = RoundedCornerShape(15.dp)
            )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(10.dp, 0.dp, 0.dp, 0.dp)
        ) {
            val image = painterResource(R.drawable.search_normal)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(20.dp)
                    .width(20.dp)
            )

            Text(
                text = "Search coffee",
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(10.dp, 0.dp, 150.dp, 0.dp)
            )

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
            ) {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .background(Brown, RoundedCornerShape(10.dp))
                        .height(45.dp)
                        .width(45.dp)
                ) {
                    val ic_furnitur = painterResource(R.drawable.furnitur_icon)
                    Image(
                        painter = ic_furnitur,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(0.dp)
                            .size(25.dp, 25.dp)
                    )
                }

            }

        }

    }
}

//    @Composable
//    fun Search() {
//        Box(
//            modifier = Modifier
//                .height(55.dp)
//                .width(315.dp)
//                .background(color = Color.Black)
//                .clip(
//                    shape = RoundedCornerShape(5.dp)
//                )
//                .border(
//                    width = 2.dp,
//                    color = Color.White,
//                    shape = RoundedCornerShape(5.dp)
//                )
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.Start,
//                modifier = Modifier
//                    .fillMaxWidth()
//            ) {
//                val image = painterResource(R.drawable.search_normal)
//                Image(
//                    painter = image,
//                    contentDescription = null,
//                    modifier = Modifier
//                        .height(20.dp)
//                        .width(20.dp)
//                )
//
//                Spacer(modifier = Modifier.weight(1f))
//
//                Text(
//                    text = "Search coffee",
//                    fontSize = 14.sp,
//                    color = Color.Gray
//                )
//
//                Spacer(modifier = Modifier.weight(1f))
//
//                Button(
//                    onClick = { /*TODO*/ },
//                    colors = ButtonDefaults.buttonColors(Brown),
//                    shape = RoundedCornerShape(10.dp),
//                    modifier = Modifier
//                        .height(50.dp)
//                        .width(80.dp)
//                ) {
//                    val ic_furnitur = painterResource(R.drawable.furnitur_icon)
//                    Image(
//                        painter = ic_furnitur,
//                        contentDescription = null,
//                        modifier = Modifier
//                            .padding(0.dp)
//                            .size(40.dp, 40.dp)
//                    )
//                }
//            }
//
//        }
//    }