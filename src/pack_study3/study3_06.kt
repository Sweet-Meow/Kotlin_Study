package pack_study3
// 다양한 인자 개수 전달 함수
/** 가변 인자 : 인자의 개수가 변하는 의미
    함수 선언 시 매개변수 왼쪽에 vararg추가
 **/

fun main () {
    numVararg(1,2,3,4) // 4개 인자구성
    numVararg(4,5,6)   // 3개 인자구성
}

fun numVararg(vararg counts: Int) {
    for (num in counts ) {
        println("$num")
    }
    println("\n")
}