package exercises.timeComplexity

fun main() {
    println(solution(10, 100, 30))
}

private fun solution(X: Int, Y: Int, D: Int): Int {
    return (Y - X + D - 1).div(D)
}