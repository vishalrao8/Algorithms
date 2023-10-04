package utils

import kotlin.math.pow
fun <T> Array<T>.swap(source: Int, destination: Int) {
    val temp = this[destination]
    this[destination] = this[source]
    this[source] = temp
}

fun IntArray.swap(source: Int, destination: Int) {
    val temp = this[destination]
    this[destination] = this[source]
    this[source] = temp
}

fun IntArray.calculateEuclideanDistance(): Double {
    return (this[0].toDouble().pow(2.0) + this[1].toDouble().pow(2.0)).pow(0.5)
}