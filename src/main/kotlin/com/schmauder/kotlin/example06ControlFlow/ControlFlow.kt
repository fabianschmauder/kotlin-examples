package com.schmauder.kotlin.example06ControlFlow

fun main(args: Array<String>) {
    val toggle = true
    println(if(toggle) "yes" else "no")

    for (index in 0 until 10 step 2){
        println(index)
    }

    for (index in 2 downTo 0){
        println(index)
    }

    val result = "Ok"

    val help = when(result){
        "Ok" -> "YEAH!"
        else -> throw IllegalStateException("AHHH")
    }

    print(help)
}
