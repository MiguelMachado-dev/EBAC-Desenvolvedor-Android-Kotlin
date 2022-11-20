fun main() {
    val carrim = Car(Model = "Carrim")
    carrim.acelerar()
    carrim.acelerar()
    carrim.acelerar()
    carrim.frear()
    carrim.frear()
    carrim.frear()
    println(carrim)
}

interface Veiculos {
    var velocity: Long
    var acceletarion: Long


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

class Car(val Model: String) : Veiculos {
    override var acceletarion: Long = 10
    override var velocity: Long = 0

    override fun toString(): String = "Modelo: $Model - Velocidade: $velocity"
}

class Moto : Veiculos {
    override var acceletarion: Long = 5
    override var velocity: Long = 0
}
