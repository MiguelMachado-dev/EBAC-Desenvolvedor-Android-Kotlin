fun main() {
    var season: Season = Season.SUMMER

    when (season) {
        Season.WINTER -> println("É inverno!")
        Season.SPRING -> println("É primavera!")
        Season.SUMMER -> println("É verão!")
        Season.FALL -> println("É outono!")
    }

    println(season.translate)
}

enum class Season(val translate: String) {
    WINTER(translate = "inverno") {
        override fun hello() = println("Olá, inverno!")
    },
    SPRING(translate = "primavera") {
        override fun hello() = println("Olá, primavera!")
    },
    SUMMER(translate = "verão") {
        override fun hello() = println("Olá, verão!")
    },
    FALL(translate = "outono") {
        override fun hello() = println("Olá, outono!")
    };

    abstract fun hello()
}
