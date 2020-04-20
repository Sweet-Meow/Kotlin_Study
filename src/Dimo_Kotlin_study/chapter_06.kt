package Dimo_Kotlin_study
// Kotlin - 흐름제어와 논리연산자 조건고려
// 흐름제어 및 논리연산자는 복잡한 조건에 따라 반복 제어 및 분기 실행

/* 코드 흐름 제어 키워드
   return => 함수를 종료하고 값을 반환하는 역할
   break => 반복문에 사용
            반복문 내에 구문이 실행되는 중간에 즉시 종료하고 다음 구문으로 넘어가는 역할
   continue => 반복문에 사용
               다음 반복조건으로 즉시 넘어가는 역할

 */

/*  break 예제
  fun main() {
    for(i in 1..10) {
        if(i == 3) break
        println(i)
    }
}
 */

/* continue 예제
fun main() {
    for(i in 1..10) {
        if(i == 3) continue
        println(i)
    }
}
 */


/* label 예제  => 외부반복문에 label 이름과 @기호를 달고 break문에 @기호와 label이름을 붙이면
                 레이블이 달린 반복문을 기준으로 즉시 break실행(continue 동일)
fun main() {
    loop@for (i in 1..10) {
        for (j in 1..10) {
            if(i == 1 && j == 2) break@loop
            println(" i : $i, j : $j")
        }
    }
}
 */

/* 논리연산자(logical operators) => 논리 값을 연산하여 새로운 논리값을 도출
   &&(and연산자) => 둘 다 true일 경우, true출력
   ||(or연산자) => 둘 중 하나라도 true이면, true 출력
   ! (not연산자) => 뒤에 붙는 값을 반전
 */

/* 논리연산자 예제 1
fun main() {
    println(true && false)
    println(true && true)
    println(true || false)
    println(!true)
    println(!false)
}
 */

fun main() {
    var a = 6
    var b = 4
    println(a > 5 && b > 5)
}
/* 실제 비교연산에서는 조건문에 자주 사용
   ex) if(i == 1 && j == 2)break
 */