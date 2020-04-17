package Dimo_Kotlin_study
// Kotlin - 조건문과 비교연산자

/* 조건문의 기본 => if문 : 주어진 값이 참이라면 따라오는 구문을 실행하는 기능
                        참과 거짓을 이용하여 프로그램에서 사용할 값을 구분해주는 역할

   다중조건문 When => switch문을 보다 간편하게 수정한 구문
                 => 하나의 변수를 여러개의 값과 비교가 가능
                 => 등호나 부등호의 사용은 불가능
                 => 조건들 중에서 먼저 부합하는 조건이 우선 실행
                 => 조건이 충족할 시 동작 대신 값을 반환하는 표현식 : when의 값을 동작 대신 값을 기입
 */

/* 비교연산자(comparison operators) => 부등호 : <, <=, >, >=, !=
                                     등호 : ==

   할당연산자 => = : 우측의 값을 좌측변수에 할당을 의미
   is 연산자 => 자료형이 맞는지 판단하는 역할, 형변환까지 가능
   !is 연산자 => 자료형이 틀린지 판단하는 역할
 */

fun main() {
    var a = 11

    if(a > 10) {     // 구문이 1개일 경우 중괄호 생략가능
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작다")
    }

    doWhen(1)
    doWhen("Kotlin")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Incheol")
}

fun doWhen(a : Any) {         // Any : 어떤 자료형이든 상관없이 호환되는 Kotlin의 최상위 자료형
    var result = when(a) {                 //
        1 -> println("정수 1입니다.")
        "Kotlin" -> println("Kotlin 학습중입니다.")
        is Long -> println("Long타입입니다.")
        !is String -> println("String타입이 아닙니다.")
        else -> println("어떠한 조건과도 충족되지 않습니다.")
    }
    println(result)
}