package com.schmauder.kotlin.example09nullsafety

class NullSafetyKt {

    fun neverNull(someString : String) = someString.length

    fun lengthOrNull(someString : String?) = someString?.length

    fun lengthElvis(someString : String?) = someString?.length ?: 0

    fun lengthOrEmpty(someString : String?) = someString.orEmpty().length

    fun throwWhenNull(someString : String?): Int {
        someString ?: throw IllegalArgumentException("String is null")
        return someString.length
    }

    fun throwDirectly(someString : String?) = someString!!.length
}