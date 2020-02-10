package pack_study2

// 세이프 콜 & 엘비스 연산자

fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1 : $str1 length : ${str1?.length ?: -1}")
}