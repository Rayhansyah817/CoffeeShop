package com.example.appcompose.ui.component.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.appcompose2.R

@Composable
fun ImageSplash() {
    val image = painterResource(R.drawable.coffe_onboarding)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .size(615.dp, 500.dp)
//                    .fillMaxsize()

        )
    }
}