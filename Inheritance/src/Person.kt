open abstract class Person {
    var name: String = ""
    var dateOfBirth: String = ""

    constructor()
    constructor(name: String, dateOfBirth: String) {
        this.name = name
        this.dateOfBirth = dateOfBirth
    }

    abstract fun display()

    abstract fun input()

    override fun toString(): String {
        return "Person(name='$name', dateOfBirth='$dateOfBirth')"
    }
}
