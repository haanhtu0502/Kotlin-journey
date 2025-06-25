package com.example.receiptapp

import retrofit.GsonConverterFactory
import retrofit.Retrofit
import retrofit.http.GET

private val retrofit = Retrofit.Builder()
    .baseUrl("https://www.themealdb.com/api/json/v1/1")
    .addConverterFactory(GsonConverterFactory.create())
    .build()


val recipeService = retrofit.create(ApiService::class.java)

interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesRespond
}