package entities

class Customer constructor(
    val firstName: String,
    val phoneNumber: String? = null,
    val nationality: String = "Polish"
) {
    fun logData(){
        println(firstName + (phoneNumber ?: " with no phone number "))
    }

}
