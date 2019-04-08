package android.com.github

import android.annotation.SuppressLint
import android.app.Application
import android.content.ContextWrapper

/**
 * desc:
 */
private lateinit var INSTANCE:Application
class App:Application(){
    override fun onCreate() {
        super.onCreate()
        INSTANCE=this
    }
}
@SuppressLint("StaticFieldLeak")
object Appcontext:ContextWrapper(INSTANCE)