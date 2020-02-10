package pack_study2
// 논리합 연산자 or
/** 두 수의 비트를 일대일 대응으로 비교하여
 *  비트의 값이 하나라도 1이면 1로 반환
 */

fun main() {
    val number1 = 12
    val number2 = 25
    val result: Int

    result = number1 or number2 // result = number1.or(number2)와 동일
    println(result)
}