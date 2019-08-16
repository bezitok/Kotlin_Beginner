class Worker: Person {

    var job: String = ""
    var company: String = ""

    constructor()
    constructor(name: String, dateOfBirth: String, job: String, company: String) : super(name, dateOfBirth) {
        this.job = job
        this.company = company
    }


    override fun display() {
        println("Worker: $name, $dateOfBirth, $job, $company")
    }

    override fun input() {
        println("Worker name: ")
        name = readLine().toString()
        println("Worker DOB: ")
        dateOfBirth = readLine().toString()
        println("Worker job: ")
        job = readLine().toString()
        println("Worker company: ")
        company = readLine().toString()
    }

}