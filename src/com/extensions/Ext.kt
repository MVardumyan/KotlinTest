package com.extensions

import com.Foo

//Extensions test

fun Foo.appendApiVersion(text: String) {
    println(text + "." + this.version)
}

val Foo.description: String
    get() = "Simple class for testing com.extensions"