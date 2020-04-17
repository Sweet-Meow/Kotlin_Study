package Dimo_Kotlin_study
// Kotlin - 타입추론과 함수

/* 타입추론(type inference) => 변수나 함수들을 선언할 때나 연산이 이루어질 때
                             자료형을 코드에 명시하지 않아도 자동으로 추론해주는 기능
   변수가 선언될 때 할당된 값의 형태로 해당 변수가 어떤 자료형을 가지는지 추론 가능
   타입추론을 사용하여 코드량 축소 가능
 */
fun main() {
    var a = 1234       // Int형으로 추론
    var b = 1234L      // Long형으로 추론
    var c = 12.34      // Double형으로 추론
    var d = 12.45f     // Float형으로 추론
    var e = 0xABCD     // 16진수는 Int형으로 추론
    var f = 0b0101010  // 2진수는 Int형으로 추론
    var g = true       // Boolean형으로 추론
    var h = 'c'        // Char형으로 추론
    println(add(5,6,7))
}

/* 함수(function) => 특정한 동작을 하거나 원하는 결과값을 연산하는데 사용
   return => 뒤에 오는 값을 반환하는 키워드
             발생 시 함수의 중간이더라도 값을 반환하고 함수 종료
 */

fun add(a : Int, b : Int, c : Int) : Int {     // 단일 표현식 함수사용으로 반환형 타입추론 가능
   return a+b+c
}