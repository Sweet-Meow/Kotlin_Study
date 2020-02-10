// 자료형 검사하기
// is키워드 : 왼쪽 항의 변수가 오른쪽 항의 자료형과 같으면  True
//           다를경우 False 출력

package pack_study2

fun main() {
    val num = 256

    if (num is Int) { // num이 Int형일때
        print(num)
    } else if (num !is Int) { // num이 Int형이 아닐때
        print("Not a Int")
    }
}