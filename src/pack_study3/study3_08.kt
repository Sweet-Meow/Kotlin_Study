package pack_study3
// 반환값에 일반 함수 사용

fun main() {
    println("funcFunc : ${funcFunc()}")
}

fun test(a : Int, b: Int) = a + b

fun funcFunc() : Int {
    return test(2,2)
}