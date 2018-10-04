package creational.builder

fun main(args: Array<String>) {
    // An idiomatic Kotlin approach to achieve the same goal as the Builder pattern
    val person = Person().apply { // apply function is applied to work as a reference of Person()
        streetAddress = "San Salvador"
        postCode = "SV1001"
        city = "San Salvador"
        role = "Developer"
        annualIncome = 11000
    } // You no longer need the build function to generate a Person instance since it is being created first
    println(person)
}