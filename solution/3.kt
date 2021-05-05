import kotlin.math.max

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        for (i in 0 until s.length) {
            val charSet = mutableSetOf<Char>()
            var length = 0
            for (j in i until s.length) {
                if (charSet.contains(s[j])) break
                charSet.add(s[j])
                length = j - i + 1
            }
            maxLength = max(maxLength, length)
        }
        return maxLength
    }
}
