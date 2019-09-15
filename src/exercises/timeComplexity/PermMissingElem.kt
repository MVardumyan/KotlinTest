package exercises.timeComplexity

fun main() {
    val arr = intArrayOf(2, 3, 1, 5)
    println(solution(arr))
}

private fun solution(A: IntArray): Int {
    if (A.isEmpty()) return 1

    val N = A.size + 1
    var result: Long = (N * (N + 1) / 2).toLong()

    A.forEach { result -= it }

    return result.toInt()
}