package com.schmauder.kotlin.example04dataclass

data class DataClass(val someInteger : Int,var someString: String)

data class DataClassWithDefaultConstructor(val someInteger : Int = 0,var someString: String = "")

fun main(args: Array<String>) {
    val example = DataClassWithDefaultConstructor(someString = "Some String")
    println(example.toString())

    example.someString = "Other String"
    println(example.toString())
}