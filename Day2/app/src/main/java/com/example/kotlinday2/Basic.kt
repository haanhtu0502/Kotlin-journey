package com.example.kotlinday2

import kotlin.random.Random

fun main(){
    print("Chọn (Keo, Bua, Bao): ")
    val result = readln().trim()

    if (result !in listOf("Keo", "Bua", "Bao")) {
        println("Chi được chọn Keo, Bua hoặc Bao!")
        return
    }

    println("Bạn ra: $result")

    // Máy chọn ngẫu nhiên
    val pcResult = listOf("Keo", "Bua", "Bao").random()
    println("Máy ra: $pcResult")

    // Xử lý kết quả
    when {
        result == pcResult -> println("Hòa!")
        (result == "Keo" && pcResult == "Bao") ||
                (result == "Bua" && pcResult == "Keo") ||
                (result == "Bao" && pcResult == "Bua") -> println("Bạn thắng!")
        else -> println("Bạn thua!")
    }

}