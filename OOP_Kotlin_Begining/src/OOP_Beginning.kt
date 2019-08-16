class Student{
    var id: Int = 0
    var name: String = ""

    constructor()
    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }

    fun displayStudent(){
        println("Student, id: $id, name: $name")
    }

}

fun main() {
//    var student1 = Student(1, "Hai")
//    student1.displayStudent()
//    var student2 = Student()
//    println("Input student2 id: ")
//    student2.id = readLine()?.toInt()!!
//    println("Input student2 name: ")
//    student2.name = readLine().toString()
//    student2.displayStudent()

    var product = Product()
    println("Product ID: ")
    var id: Int? = readLine()?.toInt()
    println("Product name: ")
    var name: String = readLine().toString()
    if (id != null) {
        product.ID = id
    }
    product.Name = name
    product.display()
}
