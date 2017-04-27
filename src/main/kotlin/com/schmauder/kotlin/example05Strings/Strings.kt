package com.schmauder.kotlin.example05Strings

import com.schmauder.kotlin.example04dataclass.DataClassWithDefaultConstructor

fun main(args: Array<String>) {
    val age = 12
    println("My Age is $age")

    val example = DataClassWithDefaultConstructor(25)
    println("My Age is ${example.someInteger}")

    println("""
    {
        "value": 12,
        "someStuff": {
            "other" : "Hello"
        }
    }
    """)
}