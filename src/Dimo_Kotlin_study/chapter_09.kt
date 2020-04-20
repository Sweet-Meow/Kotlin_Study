package Dimo_Kotlin_study
// Kotlin - 클래스 3) 클래스 상속 & 속성, 기능 확장

/* 상속(inheritance) => 1) 기존클래스에 새로운 클래스(속성 및 함수)를 생성할 때
                       2) 여러개의 클래스들의 공통점을 코드관리를 할 때
   수퍼클래스(superclass) => 속성과 함수를 물려주는 클래스
   서브클래스(subclass) => 속성과 함수를 물려받는 클래스
   open => 클래스가 상속될 수 있도록 클래스 선언 시 사용하는 키워드

   상속을 위한 규칙 => 1. 서브클래스는 수퍼클래스에 존재하는 속성과 같은 이름의 속성을 가질 수 없다.
                    2. 서브클래스가 생성될 때 반드시 수퍼클래스의 생성자까지 호출되어야한다.
 */

fun main() {
    var a = Animal("댕댕",3,"개")
    // Animal클래스에 생성한 인스턴스
    var b = Dog("멍뭉", 5)
    // Dog클래스에 생성한 인스턴스
    var c = Cat("호리",2)
    // Cat클래스에 생성한 인스턴스
    a.indroduce()
    b.indroduce()
    b.bark()
    c.indroduce()
    c.meow()
}
open class Animal(var name : String, var age : Int, var type : String) {
    fun indroduce() {
        println("해당 동물은 ${type}의 ${name}이며, ${age}년생입니다.")
    }
}

class Dog(name : String, age: Int) : Animal(name, age, "개") {
    //수퍼클래스에 상속하는 방법
    fun bark() {
        // 서브클래스만의 함수생성
        println("멍멍멍!")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "고양이") {
    // 수퍼클래스에 상속하는 서브클래스
    fun meow() {
        println("냐아아오오옹~")
    }
}
