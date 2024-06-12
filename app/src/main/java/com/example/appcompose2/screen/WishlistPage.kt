package com.example.appcompose2.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.appcompose2.ui.theme.AppCompose2Theme

@Composable
fun WishlistPage(modifier: Modifier = Modifier) {
    Text(
        text = "Wishlist Activity",
        color = Color.Green,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun WishlistPagePreview() {
    AppCompose2Theme {
        MarketPage()
    }
}