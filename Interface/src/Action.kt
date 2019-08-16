interface Action {
    var name: String
    fun run()
    fun read(){
        print("The name of book: ")
        var book: String = readLine().toString()
        println("$name is reading $book")
    }
}