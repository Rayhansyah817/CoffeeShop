package com.example.appcompose2.component.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appcompose2.R

@Preview
@Composable
fun ImagePromoPreview() {
    ImagePromo()
}

@Composable
fun ImagePromo() {
    val image_promo = painterResource(R.drawable.coffe_home_promo1)
    Box(
        modifier = Modifier
            .size(340.dp, 170.dp)
    ) {
        Image(
            painter = image_promo,
            contentDescription = null,
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .size(340.dp, 170.dp)
//                    .padding(0.dp, 100.dp, 0.dp, 30.dp)
//                    .height(140.dp)
//                    .width(315.dp)

        )
    }
//        val image_promo = painterResource(R.drawable.coffe_home_promo)
//        Image(
//            painter = image_promo,
//            contentDescription = null,
//            modifier = Modifier
//                .height(140.dp)
//                .width(315.dp)
//        )
//        Column {
//            Box(
//                modifier = Modifier
//                    .clip(
//                        shape = RoundedCornerShape(5.dp)
//                    )
//            ) {
//                Box(
//                    modifier = Modifier
//                        .background(Color.Red)
//                        .height(20.dp)
//                        .width(50.dp)
//                ) {
//                    Text(
//                        text = "Promo",
//                        fontSize = 12.sp,
//                        color = Color.White
//                    )
//                }            }
//            Box(
//                modifier = Modifier
//
//            ) {
//                Box(
//                    modifier = Modifier
//                        .background(Color.Black)
//                        .height(25.dp)
//                        .width(130.dp)
//                ) {
//                    Text(
//                        text = "Buy one get",
//                        fontSize = 24.sp,
//                        color = Color.White,
//                        modifier = Modifier
//                            .height(40.dp)
//                            .width(130.dp)
//                    )
//                }
//            }
//            Box(
//                modifier = Modifier
//                    .background(Color.Black)
//            ) {
//                Text(
//                    text = "one FREE",
//                    fontSize = 24.sp,
//                    color = Color.White
//                )
//            }
//        }
}