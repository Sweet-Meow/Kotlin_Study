package pack_study1

//사용자 클래스(pack_study1.Person)가져오기
import com.example.edu.Person

fun main() {
    val user1 = Person("Kim incheol", 27)

    println(user1.name)
    println(user1.age)
}