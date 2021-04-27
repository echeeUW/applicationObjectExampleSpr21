package edu.uw.echee.applicationobjectexample

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import edu.uw.echee.applicationobjectexample.databinding.FragmentEmailDetailBinding


class EmailDetailFragment : Fragment() {

    private val navController by lazy { findNavController() }

    lateinit var emailApp: EmailApplication

    override fun onAttach(context: Context) {
        super.onAttach(context)

        emailApp = context.applicationContext as EmailApplication
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentEmailDetailBinding.inflate(inflater)

        val receivedEmail = emailApp.email

        val allEmails = emailApp.emails

        val firstEmail = allEmails[0]

        Toast.makeText(context, "Fragment is holding onto: $firstEmail", Toast.LENGTH_SHORT).show()

        /// on buttonClick {
//        navController.navigate(NavGraphDirections.actionGlobalOtherFragment(receivedEmail))

        return binding.root
    }
}
