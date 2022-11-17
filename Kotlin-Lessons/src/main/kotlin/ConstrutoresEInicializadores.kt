import java.util.*

fun main() {
    val account = Account("Miguel")
    account.print()
    println(account.getBalance())
}

class Account(name: String) {
    private var balance: Double
    var name: String
    var address: String
    private var id: String

    init {
        this.name = name
        this.balance = 0.0
        this.address = ""
        this.id = UUID.randomUUID().toString()
    }

    fun getBalance(): Double = this.balance

    fun print() {
        println("name: ${this.name} balance: ${this.balance} address: ${this.address} id: ${this.id}")
    }
}
