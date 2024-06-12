package com.example.appcompose.ui.component.splashscreen

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcompose2.ui.theme.Brown

@Composable
fun ButtonSplash(onclick: () -> Unit) {
    Button(
        onClick = onclick,
        colors = ButtonDefaults.buttonColors(Brown),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .size(300.dp, 50.dp)
    ) {
        Text(
            text = "Get Started",
            fontSize = 16.sp
        )
    }
}