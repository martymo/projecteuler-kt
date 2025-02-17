/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package net.projecteuler.tm700

class Problem001(val size: Int = 999) {
    fun solve(): Int {
        return (1..size)
                .filter { it % 3 == 0 || it % 5 == 0 }
                .reduce { a, b -> a + b }
    }
}
