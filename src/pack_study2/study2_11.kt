package pack_study2
// Any형 변수 변환

fun main() {
    var a : Any = 1 // Any형 a는 1로 초기화될 때 int형
    a = 20L // int형이였던 a는 변경된 값 20L에 의하여 Long형으로 변환
    println("a : $a , type : ${a.javaClass}")
}