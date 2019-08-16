import kotlin.math.sqrt

fun main() {

    println("Chương trình giải phương trình bậc 2")
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0
    var s: String?
    print("Nhập hệ số a: ")
    s = readLine()
    if(s!=null){
        a = s.toInt()
    }
    print("Nhâp hệ số b: ")
    s = readLine()
    if (s!=null){
        b = s.toInt()
    }
    print("Nhâp hệ số c: ")
    s = readLine()
    if (s!=null){
        c = s.toInt()
    }

    var d: Int = b*b - 4*a*c
    if(d<0){
        print("Phương trình vô nghiệm")
    }else{
        if (d==0){
            var x: Float = (-b/(2*a)).toFloat()
            print("Phương trình có nghiệm kép: $x")
        }else{
            var x1: Float = (((-b) + sqrt(d.toDouble()))/(2*a)).toFloat()
            var x2: Float = (((-b) - sqrt(d.toDouble()))/(2*a)).toFloat()
            print("Phương trình có 2 nghiệm phân biệt: x1 = $x1, x2 = $x2")
        }
    }

}