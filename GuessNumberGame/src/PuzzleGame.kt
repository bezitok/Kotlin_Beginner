
import java.util.*

fun guess(){
    var random = Random()
    var rd = random.nextInt(100)
    var n: Int?
    println("Game đoán số")
    println("Máy đã random được 1 số trong khoảng từ 1 đến 100. Bạn hãy đoán nó")

    var countGuess: Int = 0
    while (true){
        print("Bạn đoán số nào?")
        n = readLine()?.toInt()
        if(n==null){
            break
        }else{
            if(n==rd){
                print("Chúc mừng. Bạn đã chiến thắng. Kết quả là $n")
                break
            }else{
                if(n<rd){
                    println("Số bạn đoán nhỏ hơn đáp án")
                    countGuess++
                }else{
                    println("Số bạn đoán lớn hơn đáp án")
                    countGuess++
                }
            }
        }
        if(countGuess>7){
            print("Trò chơi kết thúc. Đáp án là $rd")
            break
        }
    }
}


fun main() {
    guess()
}