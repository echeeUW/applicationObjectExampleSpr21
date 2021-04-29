package edu.uw.echee.applicationobjectexample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import edu.uw.echee.applicationobjectexample.R
import edu.uw.echee.applicationobjectexample.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

        }
    }
}
