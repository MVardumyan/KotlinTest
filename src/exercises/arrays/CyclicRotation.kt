package exercises.arrays

fun main() {
    val a = intArrayOf(3, 8, 9, 7, 6)
    val b = solution(a, 4)

    b.forEach { println(it) }
}

private fun solution(a: IntArray, k: Int): IntArray {
    if (a.isEmpty() || k == 0 || k == a.size) {
        return a
    }

    var b = a.clone()

    repeat(k) {
        b = rotate(b)
    }

    return b
}

private fun rotate(a: IntArray): IntArray {
    val b = IntArray(a.size)

    b[0] = a.last()

    for (index in 0 until a.size - 1) {
        b[index + 1] = a[index]
    }

    return b
}