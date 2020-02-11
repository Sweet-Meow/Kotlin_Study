package pack_study3
// 2개의 람다식을 매개변수로 가진 함수사용

fun main() {
    twolambda({ a, b -> "First $a $b"}, {"Second $it"})
    twolambda({ a, b -> "First $a $b"}) {"Second $it"}
}

fun twolambda(first : (String, String) -> String, second : (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}