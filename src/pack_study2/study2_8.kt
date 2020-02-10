package pack_study2

// 이중 등호 비교와 삼중 등호 비교 사용하기

fun main() {
    val a : Int = 128
    val b = a
    println(a === b)

    val c : Int? = a
    val d : Int? = a
    val e : Int? = c

    println(c == d)
    println(c === d)
    println(c === e)
}

// ==(이중등호)는 값의 내용만 비교
// ===(삼중등호)는 값의 내용과 동시에 참조된 객체의 주소도 비교