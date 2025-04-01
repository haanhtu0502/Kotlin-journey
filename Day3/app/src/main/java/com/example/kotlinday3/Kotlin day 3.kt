package com.example.kotlinday3

fun main(){
    val numList :MutableList<Any> = mutableListOf<Any>(1,2,3,4)
    numList[2] ="abc"
    
    println(numList.contains("abc"))
}

fun sum(a:Int, b:Int):Int{
    return a+b
}

