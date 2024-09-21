package com.kotlinplayground.classes

/*
Since kotlin does not support the static keyword

- `companion object` can be used to introduce static functionalities
that are tied to the class.


 */


class StudentClass(var name: String) {
    var isLoggedIn : Boolean = false

    companion object {
        // Recommended is to be a const because it's a static variable
        const val noOfEnrolledCourses = 10

        // Static function because is inside this companion block
        fun country() = "USA"

    }
}

fun main() {

    /*
        Since it's a static function i dont need an instance in order to access
        any variables or functions inside this companion object
     */
    val country = StudentClass.country()
    val enrolledCourses = StudentClass.noOfEnrolledCourses
    println("Country is $country with enrolled courses: ${enrolledCourses}")
}