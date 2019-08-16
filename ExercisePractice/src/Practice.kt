import java.util.*
import kotlin.math.sqrt

fun inputArray(n: Int, arr: IntArray){
    var rd = Random()
    for (i in 0 until n){
        arr[i] = rd.nextInt(100)
    }
}

fun outputArr(arr: IntArray){
    for(item in arr){
        print("$item\t")
    }
}

fun resultArr(arr: IntArray){
    var sum: Int = 0
    for(item in arr){
        sum += item
    }

    println("\n Sum of array: $sum")
}

fun appearanceArr(arr: IntArray){
    print("Input a number: ")
    var x: Int? = readLine()?.toInt()
    var count:Int = 0
    for(i in 0..arr.size-1){
        if(x==arr[i]){
            count++
        }
    }
    if(count == 0){
        println("$x doesn't exist in array")
    }else{
        println("$x appear $count times in array")
    }
}

fun findMaxMin(arr: IntArray){
    var max = arr.max()
    var min = arr.min()
    println("Max number: $max")
    println("Min number: $min")
}

fun isPrime(n: Int): Boolean {
    if(n<=1)
        return false
    for(i in 2..(n/2)){
        if(n%i == 0){
            return false
        }
    }
    return true
}

fun primeInArr(arr: IntArray){
    for (i in 0..(arr.size-1)){
        if(isPrime(arr[i])){
            print("${arr[i]}\t")
        }
    }
}

fun arrangeArr(arr: IntArray){
    arr.sort()
    println("\nAscending Array: ")
    outputArr(arr)
    arr.sortDescending()
    println("\nDescending Array: ")
    outputArr(arr)
}

fun main() {
    var n: Int?
    print("Input elements of array: ")
    n = readLine()?.toInt()
    if(n==null)
        return
    var arr: IntArray = IntArray(n)
    inputArray(n, arr)
    outputArr(arr)
    resultArr(arr)
    appearanceArr(arr)
    findMaxMin(arr)
    println("Prime number in array: ")
    primeInArr(arr)
    arrangeArr(arr)
}

