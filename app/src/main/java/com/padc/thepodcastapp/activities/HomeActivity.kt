package com.padc.thepodcastapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.databinding.ActivityHomeBinding
import com.padc.thepodcastapp.fragments.*

class HomeActivity : AppCompatActivity() {

    private lateinit var mBinding : ActivityHomeBinding

    companion object{
        fun newIntent(context : Context) : Intent {
            return Intent(context,HomeActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        mBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setUpBottomNavigation()
    }

    private fun setUpBottomNavigation(){
        switchFragment(MomentFragment())

        mBinding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.moment ->{
                    switchFragment(MomentFragment())
                    true
                }
                R.id.chat -> {
                    switchFragment(ChatFragment())
                    true
                }
                R.id.contacts -> {
                    switchFragment(ContactsFragment())
                    true
                }
                R.id.me -> {
                    switchFragment(ProfileFragment())
                    true
                }
                R.id.setting -> {
                    switchFragment(SettingFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun switchFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.flContainer,fragment)
            .commit()
    }
}