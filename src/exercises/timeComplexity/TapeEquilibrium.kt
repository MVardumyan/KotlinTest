package exercises.timeComplexity

fun main() {
    val arr = intArrayOf(3, 1, 2, 4, 3)
    println(solution(arr))
}

private fun solution(A: IntArray): Int {
    if (A.isEmpty() || A.size == 1) {
        return 0
    }

    val sum = A.sum()
    var leftSum = 0
    var currentSmallestDifference = -1
    var difference = 0

    for (i in 1 until A.size) {
        leftSum += A[i - 1]
        difference = Math.abs(sum - 2 * leftSum)

        if (difference < currentSmallestDifference || currentSmallestDifference == -1) {
            currentSmallestDifference = difference
        }
    }

    return currentSmallestDifference
}