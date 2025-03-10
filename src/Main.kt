/**
 * Обчислити суму та кількість елементів масиву X(n) (0<=n<=100) з парними
 * індексами.
 */
fun sumAndCountOfPairIndex(array: IntArray): IntArray {
    var sum = 0
    var count = 0
    for (i in array.indices) {
        if (i % 2 == 0) {
            sum += array[i]
            count++
        }
    }
    return intArrayOf(sum, count)
}

fun initializeArray(): IntArray? {
    println("Enter the size of array")
    val size = readln().toInt()
    if (!isValidValue(size)) {
        displayError()
        return null
    }
    var array = IntArray(size)

    for (i in array.indices){
        println("Enter the ${i + 1} element: ")
        val value = readln().toInt()
        if(!isValidValue(value)) {
            displayError()
            return null
        }
        array[i] = value
    }
    return array
}

fun displayError() {
    println("Error, value can't be more than 100 (including) or less than 0 (including)")
}

fun isValidValue(value: Int): Boolean = value > 0 && value < 100

fun setup() : Boolean {
    val array = initializeArray()
    if (array == null) return false
    println("Values of your array ${array.joinToString()}")
    val result = sumAndCountOfPairIndex(array)
    println("Sum of pair index values: ${result[0]}\nCount of pair indexes: ${result[1]}")
    return true
}

fun main() {
    if(setup()!= true) {
        main()
    }
}