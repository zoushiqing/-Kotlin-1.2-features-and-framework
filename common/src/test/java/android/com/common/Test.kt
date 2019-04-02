package android.com.common

import org.junit.Test

/**
 * desc:
 */
class Test {
    @Test
    fun test() {
        val otherwise = getBolean().yes {
            1
        }.otherwise {
            2
        }
        println(otherwise)
    }

    fun getBolean() = false
}
