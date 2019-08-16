fun main() {
    var numList: MutableList<Int> = mutableListOf(1,2,3)
    numList.add(4)
    println(numList.size)
    for(item in numList){
        print("$item\t")
    }
}