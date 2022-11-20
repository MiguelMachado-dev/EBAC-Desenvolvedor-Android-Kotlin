fun main() {
    val factory = AnimalFactory()
    val animalList: MutableList<Animal> = mutableListOf()

    for (i in 1..100) {
        val animal = factory.createAnAnimal(i % 2, i)
        animalList.add(animal)
    }

    animalList.forEach { animal ->
        println(animal)
        animal.feed()
        println(animal)

        if (animal is Lion) {
            animal.roar()
        }
    }
}

class AnimalFactory {
    fun createAnAnimal(type: Int, id: Int): Animal {
        return when (type) {
            1 -> Ant(id)
            else -> Lion(id)
        }
    }
}

// ‘Abstract’ são classes que não podem ser instanciadas
abstract class Animal(val id: Int) {
    var energy: Int = 0
    abstract var minEnergy: Int

    abstract fun feed()
    abstract fun play()
    fun isHungry(): Boolean = energy < minEnergy

    override fun toString(): String = "id: $id - energy: $energy - isHungry: ${isHungry()}"
}

class Ant(id: Int) : Animal(id) {
    override var minEnergy: Int = 2

    override fun feed() {
        this.energy++
    }

    override fun play() {
        this.energy--
    }
}

class Lion(id: Int) : Animal(id) {
    override var minEnergy: Int = 120

    override fun feed() {
        this.energy = energy + 70
    }

    override fun play() {
        this.energy = energy - 70
    }

    fun roar() {
        println("ROAR!")
    }
}
