package com.example.appcompose2.component.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Background(modifier: Modifier = Modifier) {
//    Box(
//        modifier = modifier
//            .fillMaxHeight()
//            .fillMaxWidth()
//            .background(Color.White)
//    ) {
//        Box(
//            modifier = Modifier
//                .height(280.dp)
//                .fillMaxWidth()
//                .background(Color.Black)
//        )
//    }

    Box(
        modifier = Modifier
            .height(280.dp)
            .fillMaxWidth()
            .background(Color.Black)
    )
}