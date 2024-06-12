package com.example.appcompose2.component.homescreen

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.appcompose2.R
import com.example.appcompose2.ui.theme.Brown

data class BottomBarItem(val title: String, val icon: Painter, val screen: Screen)

@Composable
fun BottomBar(selectedScreen: Screen, onScreenSelected: (Screen) -> Unit) {

    val bottomNavigation = listOf(
        BottomBarItem(
            title = stringResource(id = R.string.txt_home),
            icon = painterResource(id = R.drawable.ic_home),
            screen = Screen.HOME
        ),
        BottomBarItem(
            title = stringResource(id = R.string.txt_wishlist),
            icon = painterResource(id = R.drawable.ic_heart),
            screen = Screen.WISHLIST
        ),
        BottomBarItem(
            title = stringResource(id = R.string.txt_market),
            icon = painterResource(id = R.drawable.ic_bag),
            screen = Screen.MARKET
        ),
        BottomBarItem(
            title = stringResource(id = R.string.txt_notif),
            icon = painterResource(id = R.drawable.ic_notification),
            screen = Screen.NOTIFICATION
        )
    )

    NavigationBar(
        containerColor = Color.White,
        contentColor = Color.Black,
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
    ) {
        bottomNavigation.forEach { item ->
            NavigationBarItem(
                selected = selectedScreen == item.screen,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Brown,
                    unselectedIconColor = Color.Gray,
                    selectedTextColor = Brown,
                    unselectedTextColor = Color.Gray,
                    indicatorColor = Color.White
                ),
                onClick = { onScreenSelected(item.screen) },
                icon = { Icon(painter = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

//@Composable
//fun BottomBar(modifier: Modifier = Modifier) {
//    NavigationBar(
//        containerColor = Color.White,
//        contentColor = Color.Black,
//        modifier = Modifier
//            .clip(RoundedCornerShape(16.dp))
//
//    ) {
//        val bottomNavigation = listOf(
//            BottomBarItem(
//                title = stringResource(id = R.string.txt_home),
//                icon = painterResource(id = R.drawable.ic_home)
//            ),
//            BottomBarItem(
//                title = stringResource(id = R.string.txt_wishlist),
//                icon = painterResource(id = R.drawable.ic_heart)
//            ),
//            BottomBarItem(
//                title = stringResource(id = R.string.txt_market),
//                icon = painterResource(id = R.drawable.ic_bag)
//
//            ),
//            BottomBarItem(
//                title = stringResource(id = R.string.txt_notif),
//                icon = painterResource(id = R.drawable.ic_notification)
//            )
//        )
//        bottomNavigation.map {
//            NavigationBarItem(
//                selected = it.title == bottomNavigation[0].title,
//                colors = NavigationBarItemDefaults.colors(
//                    selectedIconColor = Brown,
//                    unselectedIconColor = Color.Gray,
//                    selectedTextColor = Brown,
//                    unselectedTextColor = Color.Gray,
//                    indicatorColor = Color.White
//                ),
//                onClick = {  },
//                icon = { Icon(painter = it.icon, contentDescription = it.title) }
//            )
//        }
//    }
//}

enum class Screen {
    HOME, WISHLIST, MARKET, NOTIFICATION
}

//@Preview
//@Composable
//fun BottomBarPreview() {
//    AppCompose2Theme {
//        BottomBar()
//    }
//}