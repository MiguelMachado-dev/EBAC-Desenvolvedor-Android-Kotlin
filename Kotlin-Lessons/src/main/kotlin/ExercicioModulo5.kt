fun main() {
    val carrim = Car(model = "Carroça")
    carrim.acelerar()
    carrim.acelerar()
    carrim.acelerar()
    carrim.frear()
    carrim.frear()
    carrim.frear()
}

abstract class Veiculos(var model: String) {
    private var velocity: Long
    abstract var acceletarion: Long

    init {
        this.model = model
        this.velocity = 0
        this.acceletarion = 10
    }

    fun acelerar() {
        println("Acelerando...")
        this.velocity += this.acceletarion
        this.getVehicleVelocity()
    }

    fun frear() {
        println("Freando...")
        this.velocity -= this.acceletarion

        if (this.velocity <= 0) {
            println("O veículo já está parado!")
            this.velocity = 0
        }
        this.getVehicleVelocity()
    }

    fun getVehicleVelocity() = println("Velocidade: ${this.velocity}")
}

class Car(model: String) : Veiculos(model) {
    override var acceletarion: Long = 0
}

class Moto(model: String) : Veiculos(model) {
    override var acceletarion: Long = 5
}
