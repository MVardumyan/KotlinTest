package exercises.arrays

fun main() {
    val numbers = intArrayOf(9, 3, 9, 3, 9, 7, 9)
    var unpairedElement = numbers.getUnpairedElementSlow()
    println(unpairedElement)

    unpairedElement = numbers.getUnpairedElement()
    println(unpairedElement)
}

private fun IntArray.getUnpairedElementSlow(): Int {
    val occurrences = mutableMapOf<Int, Int>()

    this.forEach {
        occurrences[it] = occurrences.getOrPut(it, { 0 }) + 1
    }

    return occurrences.entries.find { it.value % 2 != 0 }!!.key
}

private fun IntArray.getUnpairedElement(): Int {
    var result = 0

    for (element in this) {
        result = result.xor(element)
    }

    return result
}