package android.com.mvp

import android.content.res.Configuration
import android.os.Bundle

/**
 *2019/4/9 10:08
 */
interface ILifecycle {
    
    fun onCreate(savedInstanceState: Bundle?)
    
    fun onSaveInstanceState(outState: Bundle)
    
    fun onViewStateRestored(savedInstanceState: Bundle?)
    
    fun onConfigurationChanged(newConfig: Configuration)
    
    fun onDestroy()
    
    fun onStart()
    
    fun onStop()
    
    fun onResume()
    
    fun onPause()
}