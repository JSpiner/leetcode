class Solution {
    fun longestPalindrome(s: String): String {
        var maxRange = 0
        var maxRangeString = ""
        for (i in 0 until s.length) {
            var range = 0
            while(true) {
                val leftIndex = i - range
                val rightIndex = i + range
                if (leftIndex < 0 || rightIndex >= s.length) break
                if (s[leftIndex] != s[rightIndex]) break
                range++
            }
            if (maxRange < range) {
                maxRange = range - 1
                maxRangeString = s.substring(i - range + 1, i + range)
            }
            
            range = 0
            while(true) {
                val leftIndex = i - range
                val rightIndex = i + range + 1
                if (leftIndex < 0 || rightIndex >= s.length) break
                if (s[leftIndex] != s[rightIndex]) break
                range++
            }
            if (maxRange < range) {
                maxRange = range
                maxRangeString = s.substring(i - range + 1, i + range + 1)
            }
        }
        return maxRangeString
    }
}
