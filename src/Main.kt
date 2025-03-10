/**
 * Обчислити суму та кількість елементів масиву X(n) (0<=n<=100) з парними
 * індексами.
 */
fun fillArray(): IntArray? {
    println("How match elements do you want do add")
    val array = IntArray(readln().toInt())
    if (array.isEmpty()) {
        println("Expected a not empty array")
        return null
    }

    println("NOTE: Please, enter next numbers, that's including in range from 0 to 100")
    for (i in array.indices) {
        println("Enter the ${i + 1} number of array")
        val number: Int = readln().toInt()
        if (number < 0 || number > 100) {
            println("Expected number from range between 0 to 100, but was: $number")
            return null
        }
        array[i] = number
    }
    return array
}

fun sumAndCountOfPairIndex(array: IntArray): IntArray {
    var sum = 0
    var count = 0
    for (i in array.indices) {
        if (i % 2 == 0) {
            sum += array[i]
            count++
        }
    }
    return intArrayOf(sum,count)
}

fun main() {
    val array = fillArray()
    if (array == null) return
    println("Values of your array ${array.joinToString()}")
    val result = sumAndCountOfPairIndex(array)
    println("Sum of pair index values: ${result[0]}\nCount of pair indexes: ${result[1]}")

}