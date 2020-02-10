package pack_study3
// sum()함수 선언 및 호출

fun sum2(a : Int, b : Int) : Int {
    var sum2 = a + b
    return sum2
}

// 프로그램 진입점 역할을 하는 main함수
fun main() {
    val result1 = sum2(3,2)
    val result2 = sum2(6,7)

    println(result1)
    println(result2)
}