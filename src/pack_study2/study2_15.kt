package pack_study2
// ushr 이해하기

fun main() {
    val number1 = 5
    val number2 = -5

    println(number1 shr 1)
    println(number1 ushr 1) // 변화없음
    println(number2 shr 1) // 부호 비트가 1로 유지
    println(number2 ushr 2) // 부호 비트가 0이 되면서 변경
}