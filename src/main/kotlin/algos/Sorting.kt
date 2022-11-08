package algos

import java.util.*

object Sorting {
   fun selectionSort(array: MutableList<Int>): MutableList<Int>{
        for (outer in array.indices) {
            var minIndex = outer
            for (inner in outer + 1 until array.size) {
                if (array[inner] < array[minIndex]) {
                    minIndex = inner
                }
            }
            Collections.swap(array, minIndex, outer)
        }
        return array
    }

    fun bubbleSort(array: MutableList<Int>): MutableList<Int> {
        for (mainElementIndex in array.indices) {
            var nestedIndex = mainElementIndex
            while (nestedIndex < array.size - 1) {
                if (array[nestedIndex] > array[nestedIndex + 1]) {
                    Collections.swap(array, nestedIndex, nestedIndex+1)
                }
                nestedIndex++
            }
        }
        return array
    }
}