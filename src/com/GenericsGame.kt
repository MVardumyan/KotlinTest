package com

fun main(args: Array<String>) {
    val numbers = arrayListOf(1, 2, 3, 4, 5)

    val sum = sum(numbers)

    println(sum)
}

private fun sum(numbers: ArrayList<out Number>): Double {
    var total = 0.0
    numbers.forEach { total += it.toDouble() }

    return total
}