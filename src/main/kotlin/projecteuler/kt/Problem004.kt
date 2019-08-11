// A palindromic number reads the same both ways. The largest
// palindrome made from the product of two 2-digit numbers is 9009 =
// 91 × 99.

// Find the largest palindrome made from the product of two 3-digit
// numbers.

package projecteuler.kt

class Problem004 {
    private fun isPalindrome(number: Int) : Boolean {
        var s = number.toString()
        return s == s.reversed()
    }

    fun solve(): Int? {
        return sequence {
            for (x in 999 downTo 100) {
                for (y in 999 downTo 100)  {
                    yield(x * y)
                }
            }
        }.filter { isPalindrome(it) }
                .max()
    }
}
