class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val mergedList = mutableListOf<Int>()
        var num1Index = 0
        var num2Index = 0
        while ((num1Index >= nums1.size && num2Index >= nums2.size).not()) {
            val num1 = if (num1Index >= nums1.size) Int.MAX_VALUE else nums1[num1Index]
            val num2 = if (num2Index >= nums2.size) Int.MAX_VALUE else nums2[num2Index]
            if (num1 < num2) {
                mergedList.add(num1)
                num1Index++
            } else {
                mergedList.add(num2)
                num2Index++
            }
        }
    
        val size = mergedList.size
        if (size % 2 == 0) {
            return (mergedList[size / 2 - 1] + mergedList[size / 2]) / 2.0
        } else {
            return mergedList[size / 2].toDouble()
        }
    }
}
