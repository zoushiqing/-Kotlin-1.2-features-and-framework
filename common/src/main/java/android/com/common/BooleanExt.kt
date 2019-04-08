package android.com.common

/**
 * desc:
 */
sealed class BooleanExt<out T>

class WithData<T>(val data: T) : BooleanExt<T>()
object OtherData : BooleanExt<Nothing>()

inline fun <T> Boolean.yes(block: () -> T) =
        when {
            this -> {
                WithData(block())
            }
            else -> {
                OtherData
            }
        }

inline fun <T> BooleanExt<T>.otherWise(block: () -> T) =
        when (this) {
            is WithData -> this.data
            is OtherData -> block()
        }