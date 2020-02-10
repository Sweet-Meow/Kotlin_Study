package pack_study2
// Any형 인자를 받는 함수 만들기

fun main() {
    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x : Any) {
    if (x is String) {
        println("x is String : $x")
    }
    if (x is Int) {
        println("x is Int : $x")
    }
}