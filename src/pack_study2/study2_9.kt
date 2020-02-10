package pack_study2

// 스마트캐스트(Smart Cast) 사용하기

fun main() {
    var test : Number = 12.2
    println("$test")

    test = 12
    println("$test")

    test = 120L
    println("$test")

    test += 12.0f
    println("$test")
}

// 스마트 캐스트(Smart Cast)란
//  -> 컴파일럭 자동으로 형변환을 하는 기법
//     대표적인 자료형으로는 Number형