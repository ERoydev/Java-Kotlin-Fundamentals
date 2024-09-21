package com.kotlinplayground.classes

data class Employee(
    val id: Int,
    val name: String,
)


fun main() {
    var employee = Employee(1, "Emil")
    println(employee)
    var employee1 = Employee(1, "Emil")
    println(employee==employee1)

    var employee3 = employee.copy(
        id = 2,
        name="Bogomil"
    )
    println(employee3)

}