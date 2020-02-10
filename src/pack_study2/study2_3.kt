package pack_study2

// 문자열에 표현식 사용하기

fun main() {
    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}"

    println("str1 : \"$str1\", str2 : \"$str2\"")
}