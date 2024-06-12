package com.example.appcompose.ui.component.splashscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextSplash() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
    ) {
        Text(
            text = "Coffee so good, your taste buds will love it.",
            fontSize = 44.sp,
            lineHeight = 48.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier
                .padding(36.dp, 420.dp, 36.dp, 16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "The best grain, the finest roast, the powerful flavor.",
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            color = Color.White,
            modifier = Modifier
                .padding(64.dp, 0.dp, 64.dp, 24.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}