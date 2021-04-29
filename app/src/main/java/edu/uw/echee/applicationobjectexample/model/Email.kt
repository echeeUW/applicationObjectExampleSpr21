package edu.uw.echee.applicationobjectexample.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Email(
        val sender: String,
        val msg: String,
        val id: String = UUID.randomUUID().toString()
): Parcelable
