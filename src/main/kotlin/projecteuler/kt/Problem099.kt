package projecteuler.kt

import kotlin.math.log

class Problem099 {
    private fun data(): List<Pair<Int, Int>> {
        val file = javaClass.getResource("/p99.txt")
        val data = file.readText()
        return data.split("\n")
                .filter { it != "" }
                .map { it.split(",") }
                .map { it[0].toInt() to it[1].toInt() }
    }

    fun solve(): Int? {
        val index = data().map { it.second * 1.0 * log(it.first * 1.0, 10.0) }
                .mapIndexed { index, d -> index to d }
                .maxBy { it.second }?.first

        return if (index == null) index else index + 1
    }
}
