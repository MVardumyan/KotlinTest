package exercises.countingElements

fun main() {
    val permutation = intArrayOf(4, 1, 3, 2, 6, 5)
    val nonPermutation = intArrayOf(1, 4, 1)

    println(solution(permutation))
    println(solution(nonPermutation))
}

fun solution(A: IntArray): Int {
    val occurrences = IntArray(A.size + 1)

    for (num in A) {
        if (num > A.size || occurrences[num] == 1) {
            return 0
        }
        occurrences[num]++
    }

    for (num in 1 until occurrences.size) {
        if (occurrences[num] == 0) {
            return 0
        }
    }

    return 1
}