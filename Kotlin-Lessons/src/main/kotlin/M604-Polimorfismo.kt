//fun main() {
//    val ant = Ant()
//    val lion = Lion()
//
//    val animalList: List<Animal> = listOf(ant, lion)
//
//    animalList.forEach { animal ->
//        println(animal)
//        animal.feed()
//        println(animal)
//
//        if (animal is Lion) {
//            animal.roar()
//        }
//    }
//}
//
//// ‘Abstract’ são classes que não podem ser instanciadas
//abstract class Animal {
//    var energy: Int = 0
//    abstract var minEnergy: Int
//
//    abstract fun feed()
//    abstract fun play()
//    fun isHungry(): Boolean = energy < minEnergy
//
//    override fun toString(): String = "energy: $energy - isHungry: ${isHungry()}"
//}
//
//class Ant : Animal() {
//    override var minEnergy: Int = 2
//
//    override fun feed() {
//        this.energy++
//    }
//
//    override fun play() {
//        this.energy--
//    }
//}
//
//class Lion : Animal() {
//    override var minEnergy: Int = 120
//
//    override fun feed() {
//        this.energy = energy + 70
//    }
//
//    override fun play() {
//        this.energy = energy - 70
//    }
//
//    fun roar() {
//        println("ROAR!")
//    }
//}
