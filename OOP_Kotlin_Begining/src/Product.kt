class Product {
    private var id: Int = 0
    private var name: String = ""

    public var ID: Int
        get() {
            return id
        }
        set(value) {
            id = value
        }

    public var Name: String
        get() {
            return name
        }
        set(value) {
            name = value
        }

    constructor()

    constructor(id: Int, name: String){
        this.id = id
        this.name = name
    }

    fun display(){
        print("Product: $id, $name")
    }
}

fun main() {
    var product = Product(1, "OMO")
    product.display()
}