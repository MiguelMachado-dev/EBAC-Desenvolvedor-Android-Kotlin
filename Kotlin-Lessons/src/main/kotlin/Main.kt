fun main() {
//    firstHighOrderFunction("Hello ", "world", ::concatString)
//    firstHighOrderFunction("Another", "text", ::printStringNumberOfLetters)

    // (Função) lambda — obrigatório apenas o corpo da função {val1, val2 -> println(val1 + val2)}
    val concat: (String, String) -> Unit = { val1, val2 -> println(val1 + val2) }
    val divisao: (Int) -> Int = { it / 2 }
    println(divisao(4))

    firstHighOrderFunction("Hello ", "world", concat)

    // Dentro de {} tem o corpo da função lambda
    val operation = { number1: Int, number2: Int ->

        var result = number1 * 2
        result /= number2
        result += number1 + number2
        result
    }

    println(operation(4, 2))
}

//fun printStringNumberOfLetters(val1: String, val2: String) =
//    println("$val1 has ${val1.length} letters and $val2 has ${val2.length} letters")
//
//fun concatString(val1: String, val2: String) = println(val1 + val2)

fun firstHighOrderFunction(text1: String, text2: String, operation: (String, String) -> Unit) {
    operation(text1, text2)
}
