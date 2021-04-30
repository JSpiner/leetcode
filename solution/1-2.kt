class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sumMap = mutableMapOf<Int, Int>() // key : sum value : index
        for (i in 0 until nums.count()) {
            if (sumMap.contains(target - nums[i])) {
                return intArrayOf(
                    sumMap[target - nums[i]]!!,
                    i
                )
            }
            sumMap[nums[i]] = i
        }
        throw RuntimeException("")
    }
}
