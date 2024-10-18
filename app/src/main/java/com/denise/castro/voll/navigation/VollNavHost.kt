package com.denise.castro.voll.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.denise.castro.voll.ui.home.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
object VollRoute

@Composable
fun VollRoute() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = VollRoute) {
        composable<VollRoute> {
            HomeScreen()
        }
    }
}