package pack_study1

//사용자 클래스에 별명 붙이기

import com.example.edu.Person as User


fun main() {
    val user1 = User("Kim incheol", 27)
    val user2 = Person("hyeona96", "Yun hyeona")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}
class Person(val id : String, val name : String)