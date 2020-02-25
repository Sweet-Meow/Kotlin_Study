package pack_study3
// 람다식 매개변수 테스트

fun main() {
    noParam2({"Hello World"})
    noParam2{"Hello World"}
}

fun noParam2(out: ( ) -> String) = println(out())