package com.example.receiptapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun ReceiptApp(modifier: Modifier, navController: NavHostController) {

    NavHost(navController = navController, startDestination = Screen.ReceiptScreen.route) {
        composable(route = Screen.ReceiptScreen.route) {
            RecipeScreen(modifier = modifier, navigateToDetail = {
                navController.currentBackStackEntry?.savedStateHandle?.set("cat", it)
                navController.navigate(Screen.DetailScreen.route)
            })
        }
        composable(route = Screen.DetailScreen.route) {
            val category =
                navController.previousBackStackEntry?.savedStateHandle?.get<Category>("cat")
                    ?: Category("", "", "", "")
                CategoryDetailScreen(category)
        }
    }
}