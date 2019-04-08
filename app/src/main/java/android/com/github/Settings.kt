package android.com.github

import android.com.common.Preference


/**
 * desc:
 */
object Settings {
    var email: String by Preference(Appcontext, "email", "")
    var password: String by Preference(Appcontext, "password", "")
}