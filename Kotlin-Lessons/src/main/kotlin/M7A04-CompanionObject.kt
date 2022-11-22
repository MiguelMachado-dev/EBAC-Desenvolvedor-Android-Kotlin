fun main() {
    val person = PersonCompanionObject.Manager.createPerson()
    person.name = "John Doe"
    println(PersonCompanionObject.counter)
    person.helloPerson()

    PersonCompanionObject.Manager.decrementCounter()
    println(PersonCompanionObject.getTotalPerson())
}

fun PersonCompanionObject.helloPerson() = println("Hello, $name!")

fun PersonCompanionObject.Manager.decrementCounter() = counter--

class PersonCompanionObject private constructor() {
    var name = ""
    var email = ""

    companion object Manager {
        var counter = 0

        fun getTotalPerson(): Int = counter

        fun createPerson(): PersonCompanionObject {
            counter++
            return PersonCompanionObject()
        }

        fun incrementCounter() {
            counter++
        }
    }
}
