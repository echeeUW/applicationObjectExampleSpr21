package edu.uw.echee.applicationobjectexample.manager

import edu.uw.echee.applicationobjectexample.model.Email

class EmailManager {

    var selectedEmail: Email? = null
        private set

    val emails = listOf(
        Email("echee@uw.edu", "Spongebob is the greatest cartoon ever created"),
        Email("ironman@uw.edu", "The truth is.... I am Iron-Man"),
        Email("spiderman@uw.edu", "Mr. Stark it sounds like a new car in here"),
        Email("thanos@uw.edu", "You could not live with your own failure, and where did that leave you? Right back to me"),
        Email("hulk@mcu.com", "HUUUULLLKKK SMASSSSHHHH"),
        Email("jbieber@hotmail.com", "Lo0o0o0o0o0onnnneeellllyyyyyy...."),
        Email("a_grande@uw.edu", "thank u, next! thank u, next! thank u, next! thank u, next! thank u, next! "),
        Email("mts@uw.edu", "I don't cook, I don't clean, but let me tell you how i got this ring"),
        Email("linkinpark@gmail.com", "In the end, it doesnt even matter"),
        Email("liljon@gmail.com", "WHATTT!?!?!?..... OKAYYYYYYYYY!!!!"),
        Email("e40@gmail.com", "Tell me when to go0o0o0o0o0o0o, tell me when to gooooooo!"),
    )

    fun onEmailSelected(email: Email) {
        selectedEmail = email
    }


    var numUnreadEmails: Int = emails.size
}
