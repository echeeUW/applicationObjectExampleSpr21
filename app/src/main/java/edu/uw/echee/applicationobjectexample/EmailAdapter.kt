package edu.uw.echee.applicationobjectexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.uw.echee.applicationobjectexample.databinding.ItemEmailBinding

class EmailAdapter(
    private val items: List<Email>
): RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val binding = ItemEmailBinding.inflate(LayoutInflater.from(parent.context))


        return EmailViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = items[position]

        with(holder.binding) {
            tvEmailAddress.text = email.sender
            tvMsg.text = email.msg
        }
    }

    class EmailViewHolder(val binding: ItemEmailBinding): RecyclerView.ViewHolder(binding.root) {
    }
}

