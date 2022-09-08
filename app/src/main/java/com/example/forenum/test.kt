package com.example.forenum.test

fun main(){

    var a = student("burak",test.MALE)
    println(a.type.toString())

}

class student(var name:String, var type:test)

enum class test {
    MALE,
    FEMALE
}