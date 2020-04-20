package Dimo_Kotlin_study
// Kotlin - 클래스 1) 객체지향을 위한 클래스의 기본형태
// Kotlin은 객체지향 언어를 기반으로 함수형 언어의 장점을 흡수한 실용적인 언어

/* 클래스(Class) => 값과 그 값을 사용하는 기능들을 묶어놓은 것
   클래스 => 고유의 특징값(속성) + 기능의 구현(함수)
            인스턴스를 만드는 틀
   인스턴스(Instance) => 클래스를 이용하여 만들어내는 서로 다른 속성의 객체를 지칭하는 용어
   ex) Person A instance, Person B instance, Person C instance
   인스턴스 사용법 => 변수명.속성명
 */
fun main(){
    var a = Person("김인철", 1994)
    var b = Person("김AA", 1995)
    var c = Person("김BB", 1998)

    a.introduce() // 클래스 내에 만들어진 함수를 인스턴스와 사용
    b.introduce()
    c.introduce()
}

class Person(var name: String, val birthYear : Int) {
    fun introduce() {         // 클래스 내에 함수를 추가하여 반복실행의 비효울성을 감소
        println("안녕하세요! 저는 ${birthYear}년생 ${name}이라고 합니다.")  // 클래스내부에서는 속성이름만 사용
    }
}
