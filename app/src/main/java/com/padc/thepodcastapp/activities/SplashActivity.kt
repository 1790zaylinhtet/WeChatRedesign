package com.padc.thepodcastapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var mBinding : ActivitySplashBinding

    companion object{
        fun newIntent(context : Context) : Intent{
            return Intent(context,SplashActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setUpListeners()
    }

    private fun setUpListeners(){
        mBinding.btnSignUp.setOnClickListener {
            startActivity(GetOtpScreenActivity.newIntent(this))
        }
        mBinding.btnLogin.setOnClickListener {
            startActivity(LoginScreenActivity.newIntent(this))
        }
    }
}