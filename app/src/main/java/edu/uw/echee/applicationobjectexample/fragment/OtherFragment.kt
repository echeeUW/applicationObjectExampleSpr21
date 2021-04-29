package edu.uw.echee.applicationobjectexample.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import edu.uw.echee.applicationobjectexample.activity.SecondActivity

class OtherFragment : Fragment() {

    override fun onAttach(context: Context) {
        if (context is SecondActivity) {

        }
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val context = this.context

        context?.applicationContext

//        if (context != null) {
//
//
//            context.getString(R.string.app_name)
//            context.getDrawable(R.drawable.ic_send)
//            context.getColor(R.color.black)
//
////            context.startActivity(Intent())
//
////            context.
//
//
//        }

        return TextView(context).apply {
            text = "Hello world"
            width = 1234
            height = 400
        }
    }
}
