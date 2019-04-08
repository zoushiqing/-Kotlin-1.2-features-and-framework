package android.com.common

import org.junit.Test

/**
 * desc:
 */
class Test {
    @Test
    fun test() {
        fun getBoolean() = false

        getBoolean().yes {
            1
        }.otherWise{
            2
        }.let(::println)

        getBoolean().no {
            1
        }.otherWise{
            2
        }.let(::println)
    }

}
