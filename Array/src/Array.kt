import java.util.*
fun inputArray(n: Int, arr: IntArray){
    var random = Random()
    for(i in 0 until n){
        arr[i] = random.nextInt(51)
    }
}
fun outputArr(arr: IntArray){
    println("Mảng được tạo")
    for(item in arr){
        print(item)
        print("\t")
    }
}
fun main() {
    var n: Int?
    print("Nhập số phần tử của mảng: ")
    n = readLine()?.toInt()
    if(n!=null){
        var arr: IntArray = IntArray(n)
        inputArray(n, arr)
        outputArr(arr)
        var arr1 = arr.filter { x -> x%2==0 }
        var numMax = arr.max()
        var numMin = arr.min()
        println("\nCác số chẵn: ")
        for(item in arr1){
            print("$item\t")
        }
        println("\nSố lớn nhất trong mảng: $numMax")
        println("Số nhỏ nhất trong mảng: $numMin")
    }


}



