package com.example.appcompose2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.appcompose.ui.component.splashscreen.ButtonSplash
import com.example.appcompose.ui.component.splashscreen.ImageSplash
import com.example.appcompose.ui.component.splashscreen.TextSplash
import com.example.appcompose2.ui.theme.AppCompose2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppCompose2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    StaredScreen()
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DisplayPreview() {
        AppCompose2Theme {
            StaredScreen()
        }
    }

    @Composable
    fun StaredScreen(modifier: Modifier = Modifier) {
        Box(
            modifier
                .background(Color.Black)
        ) {
            ImageSplash()
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = modifier
            ) {
                TextSplash()
                ButtonSplash(
                    onclick = {
                        val navigate = Intent(this@MainActivity, HomeActivity::class.java)
                        startActivity(navigate)
                    }
                )
            }
        }
    }

}