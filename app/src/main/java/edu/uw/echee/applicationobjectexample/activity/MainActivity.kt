package edu.uw.echee.applicationobjectexample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import edu.uw.echee.applicationobjectexample.adapter.EmailAdapter
import edu.uw.echee.applicationobjectexample.EmailApplication
import edu.uw.echee.applicationobjectexample.databinding.ActivityMainBinding
import edu.uw.echee.applicationobjectexample.manager.AccountManager
import edu.uw.echee.applicationobjectexample.manager.EmailManager
import edu.uw.echee.applicationobjectexample.model.Email
import kotlinx.parcelize.Parcelize
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: EmailAdapter
    private lateinit var emailManager: EmailManager
    private lateinit var accountManager: AccountManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root) }

        this.emailManager = (this.applicationContext as EmailApplication).emailManager
        this.accountManager = (this.application as EmailApplication).accountManager
        accountManager.signIn("foo", "iLoveInfo448A_pleasegiveMeAnA+")

        with(binding) {

            title = "Inbox"
            adapter = EmailAdapter(emailManager.emails)

            adapter.onEmailClickedListener = { email ->

                emailManager.onEmailSelected(email)

                emailManager.numUnreadEmails--
            }

            rcEmails.adapter = adapter

            fabSend.setOnClickListener {
                launchSecondActivity(this@MainActivity)
            }

        }

    }
}
