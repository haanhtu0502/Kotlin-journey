package com.example.receiptapp

sealed class Screen(val route:String) {
    object ReceiptScreen: Screen ("receiptScreen")
    object DetailScreen: Screen("detailScreen")
}