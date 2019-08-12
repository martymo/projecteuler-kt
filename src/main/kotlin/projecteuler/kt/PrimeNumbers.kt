package projecteuler.kt

// Sieve
class PrimeNumbers() {
    fun getPrime(n: Int): List<Int> {
        // Assuming that all values are primes
        val isPrime = (2..n).associateWith { true } as MutableMap<Int, Boolean>

        var factor = 2
        while (factor * factor <= n) {
            if (isPrime.contains(factor)) {
                var j = factor
                while (factor * j <= n) {
                    // Removing every factorth value
                    isPrime[factor*j] = false
                    j++
                }
            }
            factor++
        }

        return isPrime.filter { p -> p.value }.keys.toList().sorted()
    }

    fun factorize(n: Int): List<Int> {
        val primes = getPrime(n/2)
        return sequence {
            var factored = n
            for (i in primes) {
                while (factored % i == 0) {
                    yield(i)
                    factored /= i
                }
            }
        }.toList()
    }
}
