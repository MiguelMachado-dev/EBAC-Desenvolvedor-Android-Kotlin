fun main() {
    val person = Person2()
    person.name = "John"
    person.email = "john.doe@doe.john"

    val player = Player()
    player.name = "Joe"
    player.email = "joe.poe@poe.joe"
    player.number = 9

    println(person)
    println(player)
}

open class Person2 {
    var name: String = ""
    var email: String = ""

    // Por padrão, classes que herdam de Any ou nao tem superclass, o toString() retorna o nome da classe e o hashcode do objeto
    // Sobrescrevendo o método, podemos retornar os valores das propriedades
    override fun toString(): String {
        return "name: $name - email: $email"
    }
}

class Player : Person2() {
    var number: Int = 0

    // Sobrescrita do método toString() da classe Person2
    // super acessa método da classe pai
    override fun toString(): String = super.toString() + " - number: $number"
}
