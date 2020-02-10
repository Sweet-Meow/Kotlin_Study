package pack_study2
// xor 연산자로 두 값 swap
/** 배타적합 연산자 xor는 두 비트 값을 비교하여
 *  같을 경우 0, 다를 경우 1을 반환
 *  or연산자와 반대기능을 수행
 */

fun main() {
    var number1 = 12
    var number2 = 25
    number1 = number1 xor number2  // xor연산자를 사용한 swap기법
    number2 = number1 xor number2
    number1 = number1 xor number2

    println("number1 = " + number1)
    println("number2 = " + number2)
}