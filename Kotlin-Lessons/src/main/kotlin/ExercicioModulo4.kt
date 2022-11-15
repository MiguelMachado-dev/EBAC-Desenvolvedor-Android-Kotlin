fun main() {
    println(soma(2, 5))
    println(multiplica(2, 5))
    println(calculadora(2, 5, ::soma))
    println(calculadora(2, 5, ::multiplica))

    val intList = List(99) { it }
    println(intList)
    val filteredList = intList.filter { it % 2 == 0 }
    println(filteredList)
    val stringList = listOf("João", "Miguel", "José", "Ana")
    stringList.forEach {
        println(it)
    }
}

fun soma(firstNumer: Int, secondNumber: Int): Int {
    return firstNumer + secondNumber
}

fun multiplica(firstNumber: Int, secondNumber: Int): Int = firstNumber * secondNumber

fun calculadora(firstNumber: Int, secondNumber: Int, operation: (Int, Int) -> Int): Int {
    return operation(firstNumber, secondNumber)
}
