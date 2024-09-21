package com.kotlinplayground.classes

/*
- (`object`)
    - This keyword allows us to create a class and an instance of the class at the same time.
    - Equivalent to a singleton patter in java.

Limitations:
    - You cannot inject constructor arguments to object classes.

Good For:
    - When i want to implement Singleton Pattern
 */

object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("User authenticate for userName: $userName")
    }
}

fun main() {
    val authObject = Authenticate.authenticate("Emil", "abc")
    println(authObject)
}