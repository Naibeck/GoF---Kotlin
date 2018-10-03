package creational.builder
fun main(args: Array<String>) {
    val person = Person.Builder()
            .homeAddress(address = "San Salvador")
            .postCode(code = "SV01000")
            .role(role = "Developer")
            .city(city = "San Salvador")
            .company(companyName = "Applaudo Studios")
            .income(annualIncome = 11000)
            .build()

    println(person)
}
