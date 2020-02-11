package pack_study3
// 람다식 매개변수 Test

fun main() {
    noParam({"Hello World!"})
    noParam{"Hello World!"}
}

fun noParam(out : () -> String) = println(out())