package pack_study3
// 매개변수에 람다식 함수 이용한 고차함수

fun main() {
    var result : Int
    result = highOrder({x,y -> x +y }, 10, 20)
    println(result)
}

fun highOrder(sum: (Int, Int) -> Int, a : Int, b: Int) : Int {
    return sum(a,b)
}