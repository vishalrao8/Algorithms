class Temp {
    private val hashSet: HashSet<Int> = HashSet<Int>()
    private fun helper(nums: List<Int>, mid: Int): Int {
        if (mid >= nums.size - 1 || mid <= 0) {
            return -1
        }
        val pivotValue = nums[mid]
        var sum1 = 0
        for (i in 0 until mid) {
            sum1 += nums[i]
        }
        var sum2 = 0
        for (j in mid + 1 until nums.size) {
            sum2 += nums[j]
        }
        if (hashSet.contains(sum2)) {
            return -1
        } else hashSet.add(sum2)
        return if (sum1 == sum2) {
            pivotValue
        } else if (sum1 < sum2) {
            helper(nums, mid + 1)
        } else {
            helper(nums, mid - 1)
        }
    }

    fun solve(nums: List<Int>): Int {
        val mid = (nums.size - 1) / 2
        return helper(nums, mid)
    }
}