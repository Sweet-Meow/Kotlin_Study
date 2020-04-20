package Dimo_Kotlin_study
// Kotlin - 클래스 2) 클래스 생성자 & 인스턴스 생성(기본생성자와 보조생성자)

/*
    class Person(var name: String, val birthYear : Int) => 클래스의 속성 선언과 동시에 생성자 선언
    생성자(constructor) => 새로운 인스턴스를 만들기 위해 호출하는 특별한 함수
                       => 인스턴스 속성 초기화, 인스턴스 생성시 구문 수행(init함수 사용)
    init함수 => 파라미터나 반환형이 없는 특수한 함수
            => 생성자를 통해 인스턴스가 만들어질때 호출되는 함수
    this => 인스턴스 자신의 속성이나 함수를 호출하기 위해 클래스 내부에서 사용되는 키워드

    다수 생성자를 만들때 => 클래스를 만들 때 기본으로 선언 : 기본생성자
                        필요에 따라 추가적으로 선언 : 보조생성자
    보조생성자(secondary constructor) => 기본생성자와 다른 형태의 생성자를 제공하여
                                       인스턴스 생성 시 편의를 제공하거나 추가적인 구문을 수행하는 기능을 제공
                                       constructor 키워드 사용
    보조생성자 만들 때 => 반드시 기본생성자를 통해 속성 초기화!
 */

fun main() {
    var a = Person2("김인철", 1994)
    var b = Person2("윤현아", 1996)
    var c = Person2("익명1", 1990)
    var d = Person2("익명2")
    var e = Person2("익명3")
    var f = Person2("익명4")
}
class Person2(var name : String, var birthYear : Int) {
    init{
        println("${this.birthYear}년생 ${this.name}님이 참여하셨습니다.")
    }

    constructor(name : String) : this(name,1996) {
        // 기본생성자를 통해 보조생성자의 속성 초기화
        println("보조생성자가 사용되었습니다.")
    }
}
