package exercises.countingElements

fun main() {
    val leafs = intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)
    println(solution(5, leafs))
}

private fun solution(X: Int, A: IntArray): Int {
    if (A.size >= X) {
        val positions = BooleanArray(X + 1)
        var leafsLeft = X

        for (i in A.indices) {
            if (!positions[A[i]]) {
                positions[A[i]] = true
                leafsLeft--
            }

            if (leafsLeft == 0) {
                return i
            }
        }
    }
    return -1
}