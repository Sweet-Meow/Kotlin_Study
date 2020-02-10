package pack_study2

fun main() {
    var str1 : String? = "Hello Kotlin"

    str1 = null

    println("str1 : $str1 length : ${str1?.length}")
}

// null을 허용하면 length의 실행이 불가능하다.
// 세이프 콜이란? null이 할당되어 있을 가능성이 있는 변수를 검사하여
//               안전하게 호출하도록 도와주는 기법
//               호출할 변수 이름 뒤에 ?.를 추가하면 가능

//