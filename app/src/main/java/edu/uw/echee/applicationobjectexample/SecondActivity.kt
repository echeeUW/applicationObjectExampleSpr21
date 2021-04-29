package edu.uw.echee.applicationobjectexample

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import edu.uw.echee.applicationobjectexample.databinding.ActivitySecondBinding

private const val EMAIL_KEY = "email"

fun launchSecondActivity(context: Context) = with(context) {

    startActivity(Intent(this, SecondActivity::class.java))
}


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    private val navController by lazy { findNavController(R.id.navHost) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater).apply { setContentView(root) }

        setupActionBarWithNavController(navController)
    }

    override fun onNavigateUp() = navController.navigateUp()
}
