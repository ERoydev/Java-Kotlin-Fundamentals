package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevelFunctions

// Every variable in kotlin is declared as val or var

// Variables declared with `val` are immutable variables
// val name : String = "Dilip"

// var are mutable variables
// var age: Int = 33


fun main() {
    val name : String = "Emil";
    println(name)

    // name = "Dilip1"

    var age: Int = 34
    println(age)
    age = 35
    println(age)

    val result = topLevelFunctions()
    println(result)
    println("Course name: $courseName")
}