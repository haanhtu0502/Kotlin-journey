package com.example.receiptapp

data class Category (
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String,
)

data class CategoriesRespond (
    val categories: List<Category>
)