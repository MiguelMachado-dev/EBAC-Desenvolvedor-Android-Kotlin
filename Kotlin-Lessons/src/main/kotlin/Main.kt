fun main() {
    firstHighOrderFunction("Hello ", "world", ::concatString)
    firstHighOrderFunction("Another", "text", ::printStringNumberOfLetters)
}

fun printStringNumberOfLetters(val1: String, val2: String) = println("$val1 has ${val1.length} letters and $val2 has ${val2.length} letters")

fun concatString(val1: String, val2: String) = println(val1 + val2)

fun firstHighOrderFunction(text1: String, text2: String, operation: (String, String) -> Unit) {
    operation(text1, text2)
}
