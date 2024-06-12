package com.example.appcompose2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appcompose2.component.homescreen.BottomBar
import com.example.appcompose2.component.homescreen.Screen
import com.example.appcompose2.screen.MarketPage
import com.example.appcompose2.screen.NotificationPage
import com.example.appcompose2.screen.WishlistPage
import com.example.appcompose2.ui.theme.AppCompose2Theme

class CapekPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppCompose2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomePage()
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DisplayPreview() {
        HomePage()
    }

    @SuppressLint("NotConstructor")
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun HomePage(modifier: Modifier = Modifier) {

        var currentScreen by remember { mutableStateOf(Screen.HOME) }

        Scaffold(bottomBar = { BottomBar(selectedScreen = currentScreen, onScreenSelected = { currentScreen = it }) }) { paddingValues ->
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .verticalScroll(rememberScrollState())
                    .padding(paddingValues)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(Color.White)
                ) {
                    Box(
                        modifier = Modifier
                            .height(280.dp)
                            .fillMaxWidth()
                            .background(Color.Black)
                    ) {

                    }

                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                    ) {

                        when (currentScreen) {
                            Screen.HOME -> HomePage1()
                            Screen.WISHLIST -> WishlistPage()
                            Screen.MARKET -> MarketPage()
                            Screen.NOTIFICATION -> NotificationPage()
                        }
                    }
                }
            }
        }
    }

//    @Composable
//    fun HomePage() {
//        Profile()
//        SearchBar()
//        ImagePromo()
//        ListMenu()
//        ProductCoffee(selectedButton = "Cappuccino")
//    }

}

