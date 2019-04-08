package android.com.common

import org.junit.Test

/**
 * desc:
 */
class Test {
    @Test
    fun test() {
        getBolean().yes {
            1
        }.otherWise{
            2
        }.let(::println)
    }

    fun getBolean() = false
}
