package pack_study1

import kotlin.math.PI
import kotlin.math.abs
// import kotlin.math.* 은 패키지의 여러 요소를 한번에 import

fun main() {
    val intro : String = "안녕하세요!"
    val num : Int = 27

    println(PI)              // 수학라이브러리 PI 사용
    println(abs(-12.6))   // 수학라이브러리 abs 사용

    println("$intro, $num")
}