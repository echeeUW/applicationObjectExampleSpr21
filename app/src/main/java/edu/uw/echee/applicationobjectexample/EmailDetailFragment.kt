package edu.uw.echee.applicationobjectexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import edu.uw.echee.applicationobjectexample.databinding.FragmentEmailDetailBinding


class EmailDetailFragment : Fragment() {

    private val safeArgs: EmailDetailFragmentArgs by navArgs()
    private val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentEmailDetailBinding.inflate(inflater)

        val receivedEmail = safeArgs.email

        Toast.makeText(context, "Fragment is holding onto: $receivedEmail", Toast.LENGTH_SHORT).show()

        /// on buttonClick {
        navController.navigate(NavGraphDirections.actionGlobalOtherFragment(receivedEmail))

        return binding.root
    }
}
