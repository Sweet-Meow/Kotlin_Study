package pack_study3
// 매개변수 이름 & 함수 호출

fun main () {
    namedParam( x = 200, z = 100)
    namedParam( z = 150)
}

fun namedParam(x : Int = 100,y : Int = 150 ,z : Int) {
    println(x + y + z)
}