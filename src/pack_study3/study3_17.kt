package pack_study3
// 공유 자원을 접근하는 코드 보호하기

import java.util.concurrent.locks.ReentrantLock

var sharable = 1

fun main () {
    val reLock = ReentrantLock()
    lock(reLock, {criticalFunc()})
    lock(reLock) {criticalFunc()}
    lock(reLock, ::criticalFunc)

    println(sharable)
}

fun criticalFunc() {
    sharable +=1
}

fun <T> lock(reLock : ReentrantLock, body : () -> T) : T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.lock()
    }
}