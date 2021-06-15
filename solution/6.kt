import kotlin.math.floor
import kotlin.math.roundToInt

class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s

        var result = ""
        val vallySize = numRows * 2 - 2
        val vallyCount = floor(s.length.toFloat() / vallySize).toInt()

        fun addIfPossible(startIndex: Int) {
            if (startIndex < s.length) {
                result += s.substring(startIndex, startIndex + 1)
            }
        }
        for (startIndex in 0 until numRows) {
            for (vallyIndex in 0..vallyCount) {
                val vallyHeight = numRows - startIndex
                val vallyLength = (vallyHeight - 1) * 2
                addIfPossible(startIndex + vallyIndex * vallySize)
                if (startIndex !in listOf(0, numRows - 1)) {
                    addIfPossible(startIndex + vallyIndex * vallySize + vallyLength)
                }
            }
        }
        return result
    }
}

fun main(args: Array<String>) {
    val result = Solution().convert("A", 1)
    print(result)
}
