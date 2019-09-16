fun getPrime(n: Long): List<Long> {
    // Assuming that all values are primes
    val isPrime = mutableMapOf<Long, Boolean>()

    (2L..n).associateWithTo(isPrime) { true }

    var factor = 2L
    while (factor * factor <= n) {
        if (isPrime.contains(factor)) {
            var j = factor
            while (factor * j <= n) {
                // Removing every factorth value
                isPrime[factor * j] = false
                j++
            }
        }
        factor++
    }

    return isPrime.filter { p -> p.value }.keys.toList().sorted()
}

fun main(args: Array<String>) = getPrime(args[0].toLong()).forEach(::println)

main(args)
