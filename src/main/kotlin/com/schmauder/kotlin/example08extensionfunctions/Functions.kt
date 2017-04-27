package com.schmauder.kotlin.example08extensionfunctions

fun main(args: Array<String>) {
    println("YEAH".containsAwesomeWord())

    listOf("Yeah","Wow").print()
}


fun String.containsAwesomeWord() = when(this){
    in "YEAH","WOW" -> true
    else -> false
}
fun <T> Iterable<T>.print()  = this.forEach(::println)


