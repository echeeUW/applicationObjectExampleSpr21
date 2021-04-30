package edu.uw.echee.applicationobjectexample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import edu.uw.echee.applicationobjectexample.databinding.ActivitySecondBinding

private const val EMAIL_KEY = "email"

fun launchSecondActivity(context: Context, email: Email) = with(context) {

    startActivity(Intent(this, SecondActivity::class.java).apply {
        putExtra(EMAIL_KEY, email)
    })
}


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    private val navController by lazy { findNavController(R.id.navHost) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

            navController.setGraph(R.navigation.nav_graph, intent.extras)
            setupActionBarWithNavController(navController)

            // Optionally you can manually set the bundle of the nav graphs starting bundle like so:
//            navController.setGraph(R.navigation.nav_graph, Bundle().apply {
//                putParcelable("email", intent.extras?.getParcelable<Email>(EMAIL_KEY))
//                putInt("playcount", 12345)
//            })
        }
    }

    override fun onSupportNavigateUp() = navController.navigateUp()
}
