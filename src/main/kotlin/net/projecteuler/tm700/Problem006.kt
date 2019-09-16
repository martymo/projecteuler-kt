// Find the difference between the sum of the squares of the first one
// hundred natural numbers and the square of the sum.

package net.projecteuler.tm700

class Problem006(val size: Int = 100) {
    fun solve(): Int {
        val s = (1..size).sum()
        return s * s - (1..size).map { it * it }.sum()
    }
}
