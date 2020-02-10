package pack_study3
// 변수에 할당하는 람다식 함수

fun main() {
    var result : Int
    var nulti = { x : Int, y : Int -> x * y} // 일반 함수에 람다식 할당
    result = nulti(10, 20)   // 람다식 할당 변수 : 함수사용 가능

    println(result)
}