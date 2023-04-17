class Person(val firstName: String, val lastName: String) {
    var fullName: String
    init {
        fullName = "$firstName + $lastName"
    }
}