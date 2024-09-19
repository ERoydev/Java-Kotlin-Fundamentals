package com.kotlinplayground.basics

fun main() {

    // range 1..10
    val range = 1..10 //normal range
    for (i in range) {
        println("i: $i")
    }

    // reverse range
    val reverseRange = 10 downTo 1 // i create reverse range
    for (i in reverseRange) {
        println("reverseRange I: $i")
    }

    // I add step to the loop
    for (i in reverseRange step 2) {
        println("reverseRange with Skip: $i")
    }

    // Simple for loop with break
    for (i in 1..5) {
        println("i in: $i")
        if (i == 3) break
    }

    //WHILE LOOPS
    exploreWhile()
    exploreDoWhile()

}

fun exploreWhile() {
    var x = 1
    while (x < 5 && x > -5) {
        println("Value of x is: $x")
        x += 1
    }
    println()
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("Value of i is: $i")
        i += 1
    } while (i <5)
}