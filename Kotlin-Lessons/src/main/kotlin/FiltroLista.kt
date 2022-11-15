fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val namelist = listOf("João", "Maria", "José", "Pedro", "Ana", "Paulo", "Carlos", "Mariana", "Julia", "Marcos")

    println("====== filter ======")
    val filteredList = list.filter { it % 3 == 0 }
    val filteredNotInCondition = list.filterNot { it % 3 == 0 }

    println("filteredList: $filteredList")
    println("filteredNotInCondition: $filteredNotInCondition")

    println("\n====== map ======")
    val doubleList = list.map { it * 2 }
    println("doubleList: $doubleList")

    println("\n====== zip ======")
    val zipTest = namelist.zip(doubleList) { name, number -> "$name: ${number ?: 0}" }
    println("zipTest: $zipTest")
}
