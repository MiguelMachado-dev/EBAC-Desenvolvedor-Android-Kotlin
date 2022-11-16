fun main() {
    val miguel = Person()

    miguel.name = "Miguel"
    miguel.age = 24
    miguel.email = "hello@miguelmachado.dev"
    miguel.phone = "123456789"

    miguel.printGreetings("Olá,")
    println(miguel.getEmailAndPhone())

    var vasco = Team()
    vasco.name = "Vasco da Gama"
    vasco.players.add(miguel)
    println(vasco.getAllPlayersWithNameBiggerThan(3))
}

class Person {
    var name: String = ""
    var age: Int = 0
    var email: String = ""
    var phone: String = ""

    fun getEmailAndPhone(): String {
        return "name: ${this.email} phone: ${this.phone}"
    }

    fun printGreetings(hello: String) {
        println("$hello ${this.name}")
    }

    fun isOlderThan(targetAge: Int): Boolean {
        return this.age > targetAge
    }
}

class Team {
    var players: MutableList<Person> = mutableListOf()
    var name: String = ""

    fun getAllPlayersWithNameBiggerThan(size: Int): List<Person> {
        return this.players.filter { it.name.length > size }
    }
}
