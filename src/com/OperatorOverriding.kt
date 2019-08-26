package com

class Mik(var x: Int) {
    operator fun plus(b: Mik) {
        x += b.x
    }
}

fun main() {
    val obj = Mik(1)
    obj.let {  }

    obj.plus(Mik(2))

    println(obj.x)
}