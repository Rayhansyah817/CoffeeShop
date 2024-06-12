package com.example.appcompose2.component.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProductCoffee(selectedButton: String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxHeight()
            .width(340.dp)
    ) {
        when (selectedButton) {
            "Cappuccino" -> {
                CappuccinoCoffe()
            }
            "Machiato" -> {
                MachiatoCoffe()
            }
            "Latte" -> {
                LatteCoffe()
            }
            "Americano" -> {
                AmericanoCoffe()
            }

            else -> {}
        }
    }
}