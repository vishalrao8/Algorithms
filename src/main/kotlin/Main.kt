import algos.Sorting

fun main() {
    val input = mutableListOf(2,5,4,7,9,3,0,3)
    val output = Sorting.mergeSort(input)
    println(output)
}