import algos.Sorting

fun main() {
    val unsortedArray = mutableListOf(2,5,4,7,9,3,0)
    val sortedArray = Sorting.bubbleSort(unsortedArray)
    println(sortedArray)
}