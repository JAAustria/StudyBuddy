package com.austria.studybuddy.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.austria.studybuddy.AboutActivity
import com.austria.studybuddy.ProfileActivity
import com.austria.studybuddy.R

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_settings, container, false)

        val profile = rootView.findViewById<TextView>(R.id.textView14)
        profile.setOnClickListener {
            val intent = Intent(activity, ProfileActivity::class.java)
            startActivity(intent)}

        val about = rootView.findViewById<TextView>(R.id.textView16)
        about.setOnClickListener {
            val intent = Intent(activity, AboutActivity::class.java)
            startActivity(intent)
            }
        return rootView
    }
}