package pack_study3
// 람다식 이름 사용 호출

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b : () -> Boolean) : Boolean {
    println("callByName function")
    return b()
}

val otherLambda : () -> Boolean = {
    println("otherLambda function")
    true
}