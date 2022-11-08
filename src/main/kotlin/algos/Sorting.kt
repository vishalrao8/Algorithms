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
        for (pivot in array.indices) {
            for (index in array.size - 1 downTo pivot + 1) {
                if (array[index] < array[index - 1])
                    Collections.swap(array, index, index - 1)
            }
        }
        return array
    }
}