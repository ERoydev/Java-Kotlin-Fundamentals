package com.kotlinplayground.basics

fun main() {

    // Breaks
    for (i in 1..5) {
        println("i in: $i")
        if (i == 3) break
    }

    label()
}

fun label() {
    // anyvalueiwant@ -> i create label like that and i can reference that label in my code
    loop@ for (i in 1..5) {
        println("i in label: $i")
        //if (i == 3) break@loop // like here

        innerloop@ for(j in 1..5) {
            println("j in label $j")
            //if (j == 2) break@innerloop
            if(j == 2) continue@loop // Here i can continue the outer loop
        }

    }
}