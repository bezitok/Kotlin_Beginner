class Student: Person {

    var id: Int = 0
    var school: String = ""

    constructor(name: String, dateOfBirth: String, id: Int, school: String) : super(name, dateOfBirth) {
        this.id = id
        this.school = school
    }

    constructor()


    override fun input(){
        print("Student ID: ")
        id = readLine()?.toInt()!!
        println("Student name: ")
        name = readLine().toString()
        println("Student DOB: ")
        dateOfBirth = readLine().toString()
        println("Student school: ")
        school = readLine().toString()
    }

    override fun display() {
        print("Student: $id, $name, $dateOfBirth, $school")
    }
}