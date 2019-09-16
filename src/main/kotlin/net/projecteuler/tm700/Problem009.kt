package net.projecteuler.tm700

class Problem009 {
    fun solve(): Int? {
        for (a in 1..500) {
            for (b in 1..500) {
                val c = 1000 - a - b
                if (c * c == a * a + b * b) return a * b * c
            }
        }

        return null
    }
}
