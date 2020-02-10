package pack_study3
//인자와 반환값이 없는 람다식 함수

fun main() {
    val out : () -> Unit = { println("Hello incheol")}
    // 인자와 반환값이 없는 람다식 선언
    // 자료형 추론 가능 val out = {println("Hello incheol")} 생략가능

    out() // 함수처럼 사용가능
    val new = out // 람다식변수를 다른 변수에 할당
    new()
}
