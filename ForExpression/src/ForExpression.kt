fun main() {
    //Các dạng vòng for trong Kotlin

    //Dạng 1

    var sum: Int = 0
    print("Nhập n: ")
    var n: Int? = readLine()?.toInt()
    if(n!=null){
        for(i in 1..n){
            sum += i
        }
    }
    println("Tổng (dạng 1): $sum")

    //Dạng 2

    sum = 0

    for (i in 1 until n!!){
        sum += i
    }

    println("Tổng (dạng 2): $sum")

    //Dạng 3

    var listProduct: Array<String> = arrayOf("Java", "Kotlin", "React-Native")
    for(item in listProduct){
        println(item)
    }

    //Dạng 4

    for(i in listProduct.indices){
        println("Phần tử thứ $i có tên là ${listProduct[i]}")
    }

    //Dạng 5

    for((index, value) in listProduct.withIndex()){
        println("Vị trí $index = $value")
    }
}