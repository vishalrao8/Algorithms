fun main() {
    val input = intArrayOf(6, 4, 1, 2, 9, 3, 6)
    val output = Solution().solve(input)

//    print(output.contentToString())
}

// O(nlogn) + O(m) + S(m)
class Solution {
    fun solve(nums1: IntArray) {
        nums1.sortedWith { a, b -> b - a }
    }
}