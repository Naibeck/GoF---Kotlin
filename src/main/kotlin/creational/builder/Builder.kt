package creational.builder

fun main(args: Array<String>) {
    val person = Person().apply {
        streetAddress = "San Salvador"
        postCode = "SV1001"
        city = "San Salvador"
        role = "Developer"
        annualIncome = 11000
    }
    println(person)
}