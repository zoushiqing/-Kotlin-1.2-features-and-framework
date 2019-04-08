package android.com.common

import android.annotation.SuppressLint
import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * desc:
 */
class Preference<T>(val context: Context, val name: String, val default: T, val preName: String = "default")
    : ReadWriteProperty<Any?, T> {
    private val prefs by lazy {
        context.getSharedPreferences(preName, Context.MODE_PRIVATE)
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return when (default) {
            is String ->  prefs.getString(name, default)
            is Boolean ->  prefs.getBoolean(name, default)
            is Long ->  prefs.getLong(name, default)
            else -> throw IllegalAccessException("UnSupport argument")
        }as T
    }

    @SuppressLint("CommitPrefEdits")
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        prefs.edit().apply {
            when (value) {
                is String ->putString(name, value)
                is Boolean -> putBoolean(name, value)
                is Long -> putLong(name, value)
            }
        }.apply()
    }

}