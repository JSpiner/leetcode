class Solution {
    fun reverse(x: Int): Int {
        var value = x
        var result = 0
        while (value != 0) {
            val temp: Long = (result.toLong() * 10) + value % 10
            if (temp < Int.MIN_VALUE || temp > Int.MAX_VALUE) return 0

            result = temp.toInt()
            value /= 10
        }
        return result
    }
}

fun main(args: Array<String>) {
    val result = Solution().reverse(-2143847412)
    print(result)
}
