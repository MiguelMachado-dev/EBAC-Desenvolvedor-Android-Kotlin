fun main() {
    val num = 4
    println(num.isEven())

    val baseText = "Hello"
    baseText.myConcat(" world")

    val result = 5.0 mySum 10.0
    println(result)
}

fun String.myConcat(text: String) = println(this + text)

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

infix fun Double.mySum(number2: Double): Double = this + number2
