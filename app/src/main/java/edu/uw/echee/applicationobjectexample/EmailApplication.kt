package edu.uw.echee.applicationobjectexample

import android.app.Application
import android.util.Log
import edu.uw.echee.applicationobjectexample.manager.AccountManager
import edu.uw.echee.applicationobjectexample.manager.EmailManager

class EmailApplication: Application() {

    lateinit var emailManager: EmailManager
    lateinit var accountManager: AccountManager

    override fun onCreate() {
        super.onCreate()

        this.emailManager = EmailManager()
        this.accountManager = AccountManager()

        Log.i("emailApp", "App has booted")
    }

}
