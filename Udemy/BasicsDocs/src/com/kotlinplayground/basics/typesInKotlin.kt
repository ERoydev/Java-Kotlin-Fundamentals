package com.kotlinplayground.basics

import kotlin.reflect.typeOf

// Integer Types - Byte, Short, Int, Long
// Floating-Point Types - Float, Double
// Character Type - Char
// Boolean Type - Boolean

fun main() {
    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}" ) // String  interpolation

    val multiLine = "ABC \n DEF" // New line already familiar with this syntax
    println(multiLine)

    val multiLine1 = """ // When i add three ("quoteStrings") i got this automatically with trimIndent()
        ABC
        DEF
    """.trimIndent() // The idea is to remove the useless space

    println(multiLine1)

}