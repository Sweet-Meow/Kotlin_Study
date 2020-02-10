package pack_study3
// 고차함수 형태
// 인자에 일반함수 사용

fun main() {
    val res1 = mul1(3,2)           // 일반 인자
    val res2 = mul2(sum(3,3), 3)  // 인자에 함수 사용

    println("res1 = $res1, res2 = $res2")
}

fun mul1( a: Int, b:Int) = a + b
fun mul2( a : Int, b : Int) = a*b