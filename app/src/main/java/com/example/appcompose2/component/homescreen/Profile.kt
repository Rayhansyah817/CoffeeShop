package com.example.appcompose2.component.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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

@Preview
@Composable
fun ProfilePreview() {
    Profile()
}

@Composable
fun TextLocation() {
    Column(
        modifier = Modifier.height(70.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Location",
            fontSize = 14.sp,
            color = Color.White

        )
        Text(
            text = "Blizen, Tanjungbalai",
            fontSize = 18.sp,
            color = Color.White
        )
    }

}

@Composable
fun ImageProfile() {
    val image = painterResource(R.drawable.profile)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(44.dp)

        )
    }
}

@Composable
fun Profile() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(0.dp, 0.dp, 0.dp, 0.dp)
    ) {
        TextLocation()
        Box(modifier = Modifier
            .width(140.dp)
        )
        ImageProfile()
    }
}