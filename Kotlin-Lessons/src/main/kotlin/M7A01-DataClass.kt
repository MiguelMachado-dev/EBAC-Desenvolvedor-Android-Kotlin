fun main() {
    val person = PersonData(name = "Miguel", cpf = "12345678910", email = "miguel@teste.com")
    val person2 = PersonData(name = "John", cpf = "01987654321", email = "john.doe@doe.com")
    println(person == person2)
    println(person)

    // Desestruturando um objeto
    val (name, cpf, email) = person
    println(name)
    println(cpf)
    println(email)
}

data class PersonData(val name: String, val cpf: String, val email: String)
