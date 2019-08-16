class Animal: Action {
    override var name: String
        get() {return name}
        set(value) {name = value}

    override fun run() {
        input()
        println("The $name is running")
    }

    override fun read() {
        super.read()
    }

    fun input(){
        print("Animal name: ")
        name = readLine().toString()
    }

}