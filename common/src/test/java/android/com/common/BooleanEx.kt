package android.com.common

/**
 * desc:
 */
sealed class BooleanEx<out T>

object OtherWise : BooleanEx<Nothing>()
class Wiseda<T>(val data: T) : BooleanEx<T>()

inline fun <T> Boolean.yes(block: () -> T) =
        when {
            this -> Wiseda(block())
            else -> OtherWise
        }

fun <T> BooleanEx<T>.otherwise(block: () -> T): T =
        when (this) {
            is Wiseda -> this.data
            is OtherWise -> block()
        }