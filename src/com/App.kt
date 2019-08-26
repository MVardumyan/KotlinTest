package com

import com.extensions.appendApiVersion
import com.extensions.description

fun main() {
    val foo = Foo()

    foo.printReverse("Hello")
    foo.appendApiVersion("Hello")
    println(foo.description)

    printBar()
}

//data class test
private fun printBar() {
    val bar = Bar("Mikayel", "Vardumyan")
    bar.age = 25
    println(bar)

    val barCopy = bar.copy(firstName = bar.firstName, lastName = bar.lastName)
    val (firstName, lastName) = barCopy
    println("first name is $firstName | last name is $lastName | age is ${barCopy.age}")
}