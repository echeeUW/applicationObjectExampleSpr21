package edu.uw.echee.applicationobjectexample.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import edu.uw.echee.applicationobjectexample.EmailApplication
import edu.uw.echee.applicationobjectexample.databinding.FragmentEmailDetailBinding
import edu.uw.echee.applicationobjectexample.manager.AccountManager
import edu.uw.echee.applicationobjectexample.manager.EmailManager


class EmailDetailFragment : Fragment() {

    private val navController by lazy { findNavController() }

    private lateinit var emailApp: EmailApplication
    private lateinit var emailManager: EmailManager
    private lateinit var accountManager: AccountManager

    override fun onAttach(context: Context) {
        super.onAttach(context)

        emailApp = context.applicationContext as EmailApplication
        this.emailManager = emailApp.emailManager
        this.accountManager = emailApp.accountManager
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentEmailDetailBinding.inflate(inflater)

        val allEmails = emailManager.emails
        val email = emailManager.selectedEmail
        val numOfUnread = emailManager.numUnreadEmails

        with(binding) {

            if (email != null) {
                tvFrom.text = "To: ${accountManager.username}\nFrom: ${email.sender}"
                tvMsg.text = "Msg: ${email.msg}"

                tvNumUnread.text = "Unread count: $numOfUnread"
            }
        }



        /// on buttonClick {
//        navController.navigate(NavGraphDirections.actionGlobalOtherFragment(receivedEmail))

        return binding.root
    }
}
