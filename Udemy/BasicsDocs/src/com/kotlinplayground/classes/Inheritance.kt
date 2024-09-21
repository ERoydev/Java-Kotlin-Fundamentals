package com.kotlinplayground.classes


// When i put open i allow other classes to extend this class
open class User(
    val name : String
) {
    var isLoggedIn: Boolean = false

    // i open this variable to be overriden
    open var isRegistered : Boolean = false

    // This is final function and cannot be overrided in child class
    fun login() {
        isLoggedIn = true
        println("User named: $name has logged in!")
    }

    // With Open keyword i make this function allowed to be overrided in classes that inherit this class.
    open fun register() {
        println("User name: $name is going to register now!")
    }
}

// I inherit User class and pass constructor arguments
class Student(name : String) : User(name) {
    // i override variable from the parentClass
    override var isRegistered : Boolean = false

    // With override keyword i override parent method from the inherited class
    override fun register() {
        isRegistered = true
        println("Student $name is registered!")
    }
}

class Instructor(name : String) : User(name) {

    override fun register () {
        println("Instructor $name is registered!")
        // I invoke the superclass login function from the child class
        super.login()
    }
}

fun main() {
    val student = Student("Alex")
    student.login()
    student.register()

    println("-------")

    val instructor = Instructor("Emil")
    instructor.register()
}
