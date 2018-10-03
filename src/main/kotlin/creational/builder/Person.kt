package creational.builder

data class Person(var streetAddress: String = "", var postCode: String = "", var city: String = "",
                  var companyName: String = "", var role: String = "", var annualIncome: Int = 0) {
    class Builder {
        private val person = Person()

        fun homeAddress(address: String): Builder {
            person.streetAddress = address
            return this
        }

        fun postCode(code: String): Builder {
            person.postCode = code
            return this
        }

        fun city(city: String): Builder {
            person.city = city
            return this
        }

        fun company(companyName: String): Builder {
            person.companyName = companyName
            return this
        }

        fun role(role: String): Builder {
            person.role = role
            return this
        }

        fun income(annualIncome: Int): Builder {
            person.annualIncome = annualIncome
            return this
        }

        fun build() = person
    }
}