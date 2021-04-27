package edu.uw.echee.applicationobjectexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.DisplayMetrics
import edu.uw.echee.applicationobjectexample.databinding.ActivityMainBinding
import kotlinx.parcelize.Parcelize

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

            title = "Start"

            val myEmail = Email(
                sender = "echee@uw.edu",
                msg = "Go hard or go home. yolo. floss."
            )

            fabSend.setOnClickListener {
                launchSecondActivity(this@MainActivity, myEmail)
            }

        }
    }
}

@Parcelize
data class Email(
        val sender: String,
        val msg: String
): Parcelable








/*
...
val emails = listOf(
        Email("echee@uw.edu", "Spongebob is the greatest cartoon ever created"),
        Email("ironman@uw.edu", "The truth is.... I am Iron-Man"),
        Email("spiderman@uw.edu", "Mr. Stark it sounds like a new car in here"),
        Email("thanos@uw.edu", "You could not live with your own failure, and where did that leave you? Right back to me"),
        Email("hulk@uw.edu", "HUUUULLLKKK SMASSSSHHHH"),
        Email("jbieber@uw.edu", "Lo0o0o0o0o0onnnneeellllyyyyyy...."),
)
 */
