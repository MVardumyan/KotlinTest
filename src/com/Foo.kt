package com

open class Foo {
    val version = 1.0
    var api: String = "localhost:8080/some"
        set(value) {
            field = "https://$value"
        }

    fun printReverse(text: String) {
        println(text.reversed())
    }
}