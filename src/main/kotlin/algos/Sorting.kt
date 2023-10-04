package algos

import java.util.*

object Sorting {
    //Time Complexity = O(n^2)
    fun selectionSort(list: MutableList<Int>): List<Int> {
        for (outer in list.indices) {
            var minIndex = outer
            for (inner in outer + 1 until list.size) {
                if (list[inner] < list[minIndex]) {
                    minIndex = inner
                }
            }
            Collections.swap(list, minIndex, outer)
        }
        return list
    }

    //Time Complexity = O(n^2)
    fun bubbleSort(list: MutableList<Int>): List<Int> {
        for (pivot in list.indices) {
            for (index in list.size - 1 downTo pivot + 1) {
                if (list[index] < list[index - 1]) Collections.swap(list, index, index - 1)
            }
        }
        return list
    }

    //Time Complexity = O(n^2)
    fun insertionSort(list: MutableList<Int>): MutableList<Int> {
        for (pivot in 1 until list.size) {
            var j = pivot - 1
            val target = list[pivot]

            while (j >= 0 && target < list[j]) {
                list[j + 1] = list[j]
                j--
            }
            list[j + 1] = target
        }
        return list
    }

    //Time Complexity = O(NLogN)
    //Space Complexity = O(n)
    fun mergeSort(list: List<Int>): List<Int> {
        fun helper(start: Int, end: Int, list: List<Int>): List<Int> {
            if (start >= end) {
                return list.slice(start..end)
            }

            val mid = (start + end) / 2
            val leftSide = helper(start, mid, list)
            val rightSide = helper(mid + 1, end, list)

            val auxList = mutableListOf<Int>()

            var l = 0
            var r = 0

            while (l < leftSide.size && r < rightSide.size) {
                if (leftSide[l] <= rightSide[r]) {
                    auxList.add(leftSide[l])
                    l++
                } else {
                    auxList.add(rightSide[r])
                    r++
                }
            }

            while (l < leftSide.size) {
                auxList.add(leftSide[l])
                l++
            }

            while (r < rightSide.size) {
                auxList.add(rightSide[r])
                r++
            }

            return auxList
        }

        return helper(0, list.size - 1, list)
    }

    fun quickSort(nums: List<Int>) {
        fun helper(start: Int, end: Int, nums: List<Int>) {
            if (start >= end) {
                return
            }
            val randomIndex = (start..end).random()
            // Swap random index with first value in array.
            Collections.swap(nums, start, randomIndex)
            // Start in place swapping.
            val pivot = nums[start]
            var smaller = start

            for (bigger in start + 1 .. end) {
                if (nums[bigger] <= pivot) {
                    smaller++
                    Collections.swap(nums, bigger, smaller)
                }
            }
            // Place pivot in right spot.
            Collections.swap(nums, start, smaller)
            helper(start, smaller - 1, nums)
            helper(smaller + 1, end, nums)
        }

        helper(0, nums.size - 1, nums)
    }
}