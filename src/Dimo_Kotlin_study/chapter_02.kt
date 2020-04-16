package Dimo_Kotlin_study
// Kotlin - 형변환과 배열
// 배열구조 -> 코딩의 기본 5화 동영상 참고

/* 형변환(type casting)
   하나의 변수에 지정된 자료형을 호환되는 다른 자료형으로 변경하는 기능

   형변환 함수(type casting function)
   => toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
   ex) var a : Int = 54321 -> var b : Long = a
       일반적인 할당 시 Type mismatch라는 변환에러 발생
       var a : Int = 54321 -> var b : Long = a.toLong()
       => 명시적 형변환(explicit type casting)
           - 변환될 자료형을 개발자가 직접 지정하는 행위
           - 암시적 형변환 : 변수 할당 시 자료형을 지정하지 않아도 자동으로 형변환 되는 행위
       => Kotlin에서는 암시적 형변환 지원X
 */

/* 배열(Array)
   - 배열로 사용할 변수 생성
   - arrayOf 함수를 통해 배열에 저장값을 나열
   - 특정한 공간이 있는 비어있는 배열 생성은 arrayOfNulls 함수에 크기 지정 시 null채워진 배열 생성
   - arrayOfNulls<자료형>(크기) => 제너릭(Generic)

   배열(array)에 값을 할당하거나 사용할 때
   - 배열 이름 뒤에 대괄호 후 그 안에 참조할 index 기입 ex) intarr[2]

   배열 : 처음 선언 시 전체크기를 변경할 수 없다
         but! 한번 선언 시 다른 자료구조보다 빠른 입출력 가능!
 */

fun main() {
   var intarr = arrayOf(1,2,3,4,5)
   var nullarr = arrayOfNulls<Int>(5)
   println(intarr[2]) // intarr의 2번째 index값인 3 출력
   intarr[2] = 8 // intarr의 2번째 index에 8이라는 값을 할당
   println(intarr[2])

}