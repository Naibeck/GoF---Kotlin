import creational.builder.Person
import org.junit.Assert
import org.junit.Test

class BuilderTest {
    @Test
    fun `A Person() should be created by using a Builder class`() {
        // exercise
        val person: Person = Person.Builder()
                .build()
        // validate
        Assert.assertNotNull(person)
    }

    @Test
    fun `A Person() should be created by using a Builder class with parameters`() {
        // preparation
        val evaluatePerson = Person().apply {
            streetAddress = "San Salvador"
            postCode = "SV100"
            city = "Mejicanos"
            companyName = "Applaudo"
            role = "Developer"
            annualIncome = 1000
        }
        // exercise
        val person: Person = Person.Builder()
                .homeAddress(address = "San Salvador")
                .postCode(code = "SV100")
                .city(city = "Mejicanos")
                .company(companyName = "Applaudo")
                .role(role = "Developer")
                .income(annualIncome = 1000)
                .build()

        // validate
        Assert.assertEquals(evaluatePerson, person)
    }
}