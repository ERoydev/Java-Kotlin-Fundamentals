package com.kotlinplayground.classes

// Secondary Constructor
class Item() {
    var name : String = ""
    var price : Double = 0.0

    // Getter
    get() {
        // I can add some custom logic if i want here
        return field
    }

    // Setter
    set(value) {
        if (value >= 0.0) {
            field = value
        } else {
            throw IllegalArgumentException("Negative Price is not Allowed")
        }
    }

    constructor(_name: String) : this() {
        name = _name
    }

}


fun main() {
    val item = Item("Iphone")
    println("Item name is ${item.name}")

    println(item.price)
}