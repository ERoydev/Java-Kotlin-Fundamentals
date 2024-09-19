package com.kotlinplayground.functions

import java.time.LocalDate

// FUNCTIONS
fun printName(name: String): Unit { // its like typescript i provide variable and then the type
    // Unit is type that means => the function is not returning anything (void in TS)
    // I can not write it because it's set by default to Unit
    println("Name is: $name")
}

// I need to specify what this function is going to return like TS
fun addition(a: Int, b: Int): Int {
    return a + b
}

// I have another approach for simply functions like that
fun addition_approach1(x: Int, y: Int)= x + y // i express it as an expression


// DEFAULT VALUES
fun printPersonDetails(name: String, email: String = "", dob: LocalDate = LocalDate.now()) {
    // I set default empty string to email and dob i put default value to now date too
    println("Name is $name and the email is $email and is $dob")
}


fun main() {
    printName("Emil")
    val result = addition(5, 10)
    println("Result is $result")

    val result1 = addition_approach1(13, 23)
    println("Result1 is $result1")

    // i can pass arguments like that or in order
    printPersonDetails(dob = LocalDate.parse("2000-01-10"), name="Emil")
    printPersonDetails("Emil", "emil@abv.bg")
    printPersonDetails("Emil")
}

