package edu.uw.echee.applicationobjectexample.manager

class AccountManager {

    var username: String? = null
        private set

    fun signIn(username: String, password: String) {
        // if password is valid

        this.username = username
    }

    fun signOut() {
        username = null
    }

    fun switchProfile(profileID: Long) {
        // some logic to switch profile
    }

}
