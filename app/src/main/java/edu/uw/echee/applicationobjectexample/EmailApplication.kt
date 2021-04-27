package edu.uw.echee.applicationobjectexample

import android.app.Application
import android.util.Log

class EmailApplication: Application() {

    val email: Email = Email(
        sender = "echee@uw.edu",
        msg = "3.1415926"
    )

    val emails = listOf(
        Email("echee@uw.edu", "Spongebob is the greatest cartoon ever created"),
        Email("ironman@uw.edu", "The truth is.... I am Iron-Man"),
        Email("spiderman@uw.edu", "Mr. Stark it sounds like a new car in here"),
        Email("thanos@uw.edu", "You could not live with your own failure, and where did that leave you? Right back to me"),
        Email("hulk@uw.edu", "HUUUULLLKKK SMASSSSHHHH"),
        Email("jbieber@uw.edu", "Lo0o0o0o0o0onnnneeellllyyyyyy...."),
    )


    override fun onCreate() {
        super.onCreate()

        Log.i("emailApp", "App has booted")
    }

}
