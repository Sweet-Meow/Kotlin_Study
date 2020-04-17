package Dimo_Kotlin_study
// Kotlin - 반복문과 증감연산자

/* 반복문 => 조건이 참인 경우 반복을 유지 : 조건형 반복문
         => 반복 범위를 정해 반복을 수행 : 범위형 반복문
         => 조건형 반복문 : while문 , do while문
         => 범위형 반복문 : for문

 */
/* 증가연산자(increment operators) =>  ++a , a++
                                 => 변수의 값을 1 증가시켜주는 역할
   감소연산자(decrement operators) => --a, a--
                                 => 변수의 값을 1 감소시켜주는 역할
   전위연산자 => ++a, --a
            => 연산자가 포함된 구문에서 이미 증감된 수를 반영하여 연산을 진행
   후위연산자 => a++, a--
            => 증가나 감소된 수를 해당구문에서 사용하지않고 다음구문부터 사용
 */

/* while구문 예시
fun main() {
     var a = 0
     while (a < 5) {
         println(++a)
     }
 }

 */

/* do while구문 예시
fun main() {     // 최초 한번은 조건없이 do에서 구문을 실행 후 while로 조건을 체크
     var a = 0
     do {
         println(a++)
     } while(a<5)
 }
 */

/* for 증가구문 예시
fun main() {
     for(i in 0..9 step 3) {           // step : 증가 및 감소되는 구간을 의미
         print(i)        // print : 줄을 떼지 않고 붙여서 출력
     }
 }
 */

/* for 감소구문 예시
fun main() {
    for(i in 9 downTo 0 step 3) {
        print(i)
    }
}
 */

// for구문 char형 예시
fun main() {
    for (i in 'z' downTo 'a' step 4 ) {
        print(i)
    }
}