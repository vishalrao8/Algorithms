import java.util.*
import kotlin.collections.ArrayList

//class GroupStudy {
//    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
//        var pivot1 = nums1.lastIndex
//        var pivot2 = nums2.lastIndex
//
//        var mid = m-1
//
//        while(pivot2 >= 0 && mid >= 0) {
//            if (nums1[mid] > nums2[pivot2]) {
//                nums1.swap(mid, pivot1)
//                nums1[mid] = nums2[pivot2]
//                mid--
//                pivot1--
//            } else {
//                nums1[pivot1] = nums2[pivot2]
//                pivot1--
//            }
//            pivot2--
//        }
//    }
class GroupStudy {
    fun letter_case_permutations(s: String): ArrayList<String> {
        val collector = ArrayList<String>()
        fun helper(problem: String, idx: Int, slate: StringBuffer) {
            if (problem.length == idx) {
                collector.add(slate.toString())
                return
            } else {
                if (problem[idx].isDigit()) {
                    helper(problem, idx+ 1 ,slate)
                } else {
                    slate.append(problem[idx].uppercaseChar())
                    helper(problem, idx + 1, slate)
                    slate.deleteCharAt(slate.lastIndex)

                    slate.append(problem[idx].lowercaseChar())
                    helper(problem, idx + 1, slate)
                    slate.deleteCharAt(slate.lastIndex)
                }
            }

        }
        return collector
    }
}