package exercises.binaryGap

fun main() {
    println(getBiggestBinaryGap(1041))
    println(getBiggestBinaryGap(5))

}

private fun getBiggestBinaryGap(number: Int): Int {
    if (number <= 1) {
        return 0
    }

    var gap = 0
    var previousPosition: Int? = null
    val binaryValue = Integer.toBinaryString(number)

    for (c in 0 until binaryValue.length) {
        if (binaryValue[c] == '1') {
            if (previousPosition != null) {
                gap = updateGap(gap, c, previousPosition)
            }
            previousPosition = c
        }
    }

    return gap
}

private fun updateGap(currentGap: Int, position: Int, previousPosition: Int): Int {
    val gap = position - previousPosition - 1

    if (gap > currentGap) {
        return gap
    }

    return currentGap
}