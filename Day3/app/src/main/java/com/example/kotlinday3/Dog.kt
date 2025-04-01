package com.example.kotlinday3

private class Dog(
    val name:String,
    val age:Int = 0,
) {

    init{

    }

    fun bark(){
        println("Gau gau")
    }
}