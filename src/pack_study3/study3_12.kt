package pack_study3
// 값에 의한 호출로 람다식 사용

fun main() {
    val result = callByValue(lambda()) // 람다식 함수 호출
    println(result)
}

fun callByValue(b : Boolean) : Boolean {
    println("callByValue function")
    return b
}

val lambda : () -> Boolean = {  // 람다표현식 2줄
    println("lambda function")
    true
}