package pack_study3
// 함수 호출 원리 파악

fun main () {
    val num1 = 10
    val num2 = 3
    val result : Int
    // 임시 변수 또는 지역변수
    // 지역변수 : 함수의 종료와 함께 스택 프레임과 함께 사라지는 임시변수

    result = max(num1, num2)

    println(result)
}

fun max(a : Int, b: Int) = if( a > b ) a else b
// a와 b는 max()함수의 임시 변수