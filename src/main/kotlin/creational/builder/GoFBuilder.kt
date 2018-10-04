package creational.builder
fun main(args: Array<String>) {
    // Actual usage of Builder pattern defined by the GoF
    val person = Person.Builder()
            .homeAddress(address = "San Salvador")
            .postCode(code = "SV01000")
            .role(role = "Developer")
            .city(city = "San Salvador")
            .company(companyName = "Applaudo Studios")
            .income(annualIncome = 11000)
            .build() // You need to call build method to return the person instance

    println(person)
}
