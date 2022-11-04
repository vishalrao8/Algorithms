import algos.Sorting

fun main() {
    val unsortedArray = arrayOf(2,5,4,7,9,3,0)
    val sortedArray = Sorting.selectionSort(unsortedArray)
    println(sortedArray.contentToString())
}