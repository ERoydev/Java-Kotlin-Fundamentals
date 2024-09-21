package com.kotlinplayground.classes

// I make data class
// izpolzva se za klasove koito she budat polzvani za data containers
// dava mi mnogo funkcionalnosti
data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {

    val course = Course(1, "TypeScript", "E. Roydev")

    val course1 = Course(1, "Reactive", "E. Roydev")
    println(course == course1) // i can check if the objects are with the same properties(data class benefits)

    val newInstance = course1.copy( // i can copy and create new instance for data class
        id = 3, author = "Roikata"
    )
    println(newInstance)
}