fun main() {
    val player = GoalKeeper()
    player.number = 1
    player.goalsConced = 10

    println(player)
}

// ‘Interfaces’ são entidades, não classes
// Uma Class pode implementar múltiplas Interfaces
// Todos os métodos e propriedades de uma ‘interface’ sem implementação são abstratos por padrão.
// Pode definir propriedades, mas não pode guardar estado, por isso todas as suas propriedades são val.
// Não pode ter construtores
interface PlayerInterface {
    val name: String
        get() = "Teste"

    var number: Int

    fun rating(): Int
    fun isAGoodPlayer(): Boolean {
        return rating() > 5
    }
}

class GoalKeeper : PlayerInterface {
    override var number = 0
    var goalsConced = 0

    override fun rating() = 5

    override fun toString(): String = "name: $name - number: $number - goalsConced: $goalsConced"
}
