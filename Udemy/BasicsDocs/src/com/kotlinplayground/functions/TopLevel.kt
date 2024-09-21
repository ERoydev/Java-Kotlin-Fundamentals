package com.kotlinplayground.functions

// TOP LEVEL FUNCTIONS
// In kotlin, properties that does not belong to class are called top-level properties
// Kotlin mi pozvolqva da suzdam propertita, koito mogat da budat chast ot kotlin file, a ne class

// i declare as a constant because i use it accross my app
const val courseName = "Kotlin Programming"

fun topLevelFunctions(): String {
    val rNum = (1..100).random()
    return "Top Level Func result: $rNum"
}

fun main() {
    val num = topLevelFunctions()
    println("Num is: $num")
}