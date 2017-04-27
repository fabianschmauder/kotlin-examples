package com.schmauder.kotlin.example03class


class SimpleClasses(val finalString: String, var modifiableString: String){
    fun modify(){
        modifiableString = "Some Text"
        //finalString = "Not possible"
    }
}

class SimpleClassesWithDefault(val finalString: String = "defaultString", var modifiableString: String = "")

fun main(args: Array<String>) {
    val example = SimpleClassesWithDefault(modifiableString = "Some String")
    println(example.modifiableString)

    example.modifiableString = "Other String"
    println(example.modifiableString)
}