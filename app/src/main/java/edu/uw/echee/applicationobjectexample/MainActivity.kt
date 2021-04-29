package edu.uw.echee.applicationobjectexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.DisplayMetrics
import android.util.Log
import edu.uw.echee.applicationobjectexample.databinding.ActivityMainBinding
import kotlinx.parcelize.Parcelize
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: EmailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root) }

        val emailApp: EmailApplication = this.applicationContext as EmailApplication

        with(binding) {

            val myEmail = emailApp.email

            title = "Inbox"
            adapter = EmailAdapter(emailApp.emails)
            rcEmails.adapter = adapter

            fabSend.setOnClickListener {
                launchSecondActivity(this@MainActivity)
            }

        }

    }
}

@Parcelize
data class Email(
        val sender: String,
        val msg: String,
        val id: String = UUID.randomUUID().toString()
): Parcelable
