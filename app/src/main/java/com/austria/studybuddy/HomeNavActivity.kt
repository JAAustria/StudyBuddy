package com.austria.studybuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.austria.studybuddy.Fragments.HomeFragment
import com.austria.studybuddy.Fragments.ScheduleFragment
import com.austria.studybuddy.Fragments.SettingsFragment
import com.austria.studybuddy.Fragments.TaskFragment
import com.austria.studybuddy.databinding.ActivityHomeNavBinding

class HomeNavActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeNavBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.schedule -> replaceFragment(ScheduleFragment())
                R.id.settings -> replaceFragment(SettingsFragment())
                R.id.task -> replaceFragment(TaskFragment())
            }
            true
        }
        binding.logout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}