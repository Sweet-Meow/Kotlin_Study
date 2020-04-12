package Dimo_Kotlin_study

import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue

// 주석 달기
/* 주석
   여러줄 달기
 */

fun main() {
    println("Kotlin 문법은 자바와 다르게")
    println("끝에 ;, 즉 세미콜론을 붙이지 않아도 된다.")
    ex1()
    ex2()
}



// 클래스 이름 -> 파스칼 표기법 : 모든 단어를 대문자로 시작 ex) ClassName
// 함수나 변수 이름 -> 카멜 표기법 : 첫 단어만 소문자로 시작 ex) functionName

/* 변수 선언 방법
   var : 일반적으로 통용되는 변수,
         언제든지 읽기 및 쓰기가 가능
   val : 선언시에만 초기화 가능,
         중간에 값 변경 불가능
*/

/* 선언 위치에 따른 변수명
   property -> 속성을 의미 & 클래스에 선언된 변수
   Local Variable -> 로컬변수를 의미 & 이 외 Scope내에 선언된 변수
 */
fun ex1() {
    var a: Int = 123
    println(a)

    var b: Int
    b = 124
    println(b)
}
    /* 변수에 값이 할당되지 않았을 시
       ex) var a : Int? = null
       으로 null을 허용하는 nullable변수로 선언 가능
       nullable변수란? null상태로 연산할 시 null pointer exception 발생할 수 있으므로 주의하여 사용
     */

    /* 기본자료형
       정수형 : Byte(8bits), Short(16bits), Int(32bits), Long(64bits)
       실수형 : Float(32bits), Double(64bits)
       문자형 : Char
       논리형 : Boolean
     */
fun ex2() {
        val x = "한줄 문자열 입력"
        val y = """여러줄의 
                   문자열
                   입력
        """
        println(x)
        println(y)
    }

