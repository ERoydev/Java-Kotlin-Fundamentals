package com.kotlinplayground.basics

import java.util.Scanner

fun main() {
    // if-else
    // when

    var name = "Alex"
    name = "Chloe"

    // In Kotlin function is an `expression` and i can i assign it to a variable, but i can do in it the clean way like in JS too.
    val result = if (name.length == 4) {
        println("Name is four Characters.")
        name // i return a value for the variable but i can skip this of course
    } else {
        println("Name is not four Characters.")
        name.length
    }

    println("result: $result")


    val position = 3

    // IF BLOCK
    val medalResult = if (position == 1) {
        "GOLD" //return
    } else if (position == 2) {
        "SILVER" //return
    } else if (position == 3) {
        "BRONZE" //return
    } else {
        "NO MEDAL" //return
    }

    // WHEN BLOCK (similar to switch in JS)
    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println("Medal: $medal")
}
