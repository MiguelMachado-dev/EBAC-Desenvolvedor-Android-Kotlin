fun main() {
    val factory = VeiculosFactory()
    val carro = factory.createAnVeiculo(type = 1, id = 1)
    val moto = factory.createAnVeiculo(type = 2, id = 2)
    val veiculosList: List<Veiculos> = listOf(carro, moto)

    veiculosList.forEach { veiculo ->
        if (veiculo is Car) {
            println(veiculo.name)
        } else if (veiculo is Moto) {
            println(veiculo.name)
        }

        veiculo.acelerar()
        veiculo.frear()
    }

}

class VeiculosFactory {
    fun createAnVeiculo(type: Int, id: Int): Veiculos {
        return when (type) {
            1 -> Car(id)
            else -> Moto(id)
        }
    }
}

abstract class Veiculos(private val id: Int) {
    private var velocity: Long = 0
    abstract var acceletarion: Long


    fun acelerar() {
        println("Acelerando...")
        this.velocity += this.acceletarion
        this.getVehicleVelocity()
    }

    fun frear() {
        println("Freando...")
        this.velocity -= this.acceletarion

        if (this.velocity < 0) {
            println("O veículo já está parado!")
            this.velocity = 0
        }
        this.getVehicleVelocity()
    }

    private fun getVehicleVelocity() = println("Veiculo de id: $id - Velocidade: ${this.velocity}")
}

class Car(id: Int) : Veiculos(id) {
    override var acceletarion: Long = 10
    val name = "Carro"
}

class Moto(id: Int) : Veiculos(id) {
    override var acceletarion: Long = 5
    val name = "Moto"
}
