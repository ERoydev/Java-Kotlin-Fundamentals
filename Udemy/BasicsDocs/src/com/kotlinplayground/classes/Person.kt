package com.kotlinplayground.classes

//class Person {
//    fun action() {
//        println("Person Walks")
//    }
//}

// This () is a Primary Constructor
class Person(val name: String = "Unknown", val age: Int = 0, val salary: Int = 950) {

    var email : String = ""
    var nameLength: Int = 0
    // This is initialization code
    init {
        println("Inside init block")
        nameLength = name.length
    }
    constructor(_email : String,
        _name: String = "",
        _age: Int = 0
        ) : this(_name, _age){
        email = _email
    }

    fun action() {
        println("Person Walks")
    }
}


// Here i can create instance of the class and call its methods
fun main() {
    val person = Person("Emil", 23)
    println("Name: ${person.name}, Age: ${person.age}, Salary: ${person.salary}")

    val person2 = Person(_email="emil@abv.bg", _name="Emil", _age=23)
    println("Name: ${person2.name}, Age: ${person2.age}, Salary: ${person2.salary}, Email: ${person2.email}, NameLength: ${person2.nameLength}")

}
