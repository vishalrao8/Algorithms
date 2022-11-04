package algos

object Sorting {
   fun selectionSort(array: Array<Int>): Array<Int>{
        for (outer in array.indices) {
            var minIndex = outer
            for (inner in outer + 1 until array.size) {
                if (array[inner] < array[minIndex]) {
                    minIndex = inner
                }
            }
            val temp = array[minIndex]
            array[minIndex] = array[outer]
            array[outer] = temp
        }
        return array
    }

    fun bubbleSort(array: Array<Int>): Array<Int> {
        throw UnknownError()
    }
}