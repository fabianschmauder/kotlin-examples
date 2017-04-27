package com.schmauder.kotlin.example07functions

fun main(args: Array<String>) {
    println(calculate(1,2))
    println(calculate2(3,2))
    println(decide("Ok"))
}


fun calculate(a: Int, b: Int): Int {
    return a + b
}

fun calculate2(a: Int, b: Int) = a + b

fun decide(input:String) = when(input){
    "Ok" -> "Yeah!!"
    else -> "Noo!!"
}