fun main() {
    print("Nhập số từ 1 đến 3: ")
    var num: Int? = readLine()?.toInt()
    when(num){
        1 -> print("Bạn chọn số 1")
        2 -> print("Bạn chọn số 2")
        3 -> print("Bạn chọn số 3")
        else -> print("Bạn ko chọn số nào từ 1 đến 3")
    }
}