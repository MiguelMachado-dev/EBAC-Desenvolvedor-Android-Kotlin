fun main() {
    SchedulerHandler.currentSeason()
    SchedulerHandler.setSeason(Season.SPRING)
    SchedulerHandler.currentSeason()

    val otherClass = OtherClass()
    SchedulerHandler.currentSeason()
}

class OtherClass() {
    init {
        SchedulerHandler.setSeason(Season.FALL)
    }

    fun printCurrentSeason() = SchedulerHandler.currentSeason()
}

object SchedulerHandler {
    private var season: Season = Season.WINTER

    fun setSeason(newSeason: Season) {
        this.season = newSeason
    }

    fun currentSeason() = println(season)
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
