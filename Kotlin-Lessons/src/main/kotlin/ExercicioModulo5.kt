fun main() {
    val carrim = Veiculos(model = "Carroça")
    carrim.acelerar()
    carrim.acelerar()
    carrim.acelerar()
    carrim.frear()
    carrim.frear()
    carrim.frear()
}

class Veiculos(model: String) {
    private var velocity: Long
    private var acceletarion: Long
    var model: String

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
