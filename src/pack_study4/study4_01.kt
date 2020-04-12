package pack_study4
// 공유 자원을 접근하는 코드 보호 예제

import pack_study3.criticalFunc
import pack_study3.lock
import java.util.concurrent.locks.ReentrantLock

var sharable = 4
// 보호가 필요한 공유자원
// 여러 루틴에서 접근 가능!

fun main() {
    val reLock = ReentrantLock()
    lock(reLock, { criticalFunc() })
    lock(reLock) { criticalFunc() }
    lock(reLock, ::criticalFunc)

    println(sharable)
}
fun criticalFunc() {
    // 공유 자원 접근 코드 사용
    sharable += 1
}

fun <T> lock(reLock : ReentrantLock, body : ( )->T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}
