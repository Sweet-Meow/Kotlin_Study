package pack_study2

//null 처리하기

fun main() {
    var str1 : String? = "Hello World"

    str1 = null // 오류값인 null을 허용하지 않는다

    println("str1 : $str1")
}


// String 과 String? 은 서로 다른 자료형이다!