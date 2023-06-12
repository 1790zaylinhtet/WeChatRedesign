package com.padc.thepodcastapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.databinding.ActivityLoginScreenBinding
import com.padc.thepodcastapp.mvp.impls.LoginPresenterImpl
import com.padc.thepodcastapp.mvp.presenters.LoginPresenter
import com.padc.thepodcastapp.mvp.view.LoginView


class LoginScreenActivity : AppCompatActivity(),LoginView {

    private lateinit var mBinding : ActivityLoginScreenBinding
    private lateinit var mPresenter : LoginPresenter

    companion object{
        fun newIntent(context : Context) : Intent{
            return Intent(context,LoginScreenActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        mBinding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setUpPresenter()

        setUpListeners()


    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProvider(this)[LoginPresenterImpl::class.java]
        mPresenter.initPresenter(this)
    }
    private fun setUpListeners(){
        mBinding.btnLogin.setOnClickListener {
            mPresenter.onTapLoginButton()
        }
        mBinding.ivLeftButton.setOnClickListener {
            mPresenter.onTapBackButton()
        }
    }

    override fun navigateToPreviousScreen() {
        startActivity(SplashActivity.newIntent(this))
    }

    override fun navigateToHomeScreen() {
        startActivity(HomeActivity.newIntent(this))
    }

    override fun showError(error: String) {
        Toast.makeText(this,error,Toast.LENGTH_LONG).show()
    }


}