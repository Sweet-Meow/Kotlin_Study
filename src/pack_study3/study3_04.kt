package pack_study3
// 함수 매개변수 기본값 지정

fun main() {
    val name = "김인철"
    val email = "test@gmail.com"

    add(name)
    add(name, email)
    add("윤현아", "test2@naver.com")
    defaultArgs()
    defaultArgs(200)
}

fun add(name : String, email: String = "default") {
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x : Int = 100, y : Int = 200) {
    println(x + y)
}