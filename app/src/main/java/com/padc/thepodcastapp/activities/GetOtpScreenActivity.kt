package com.padc.thepodcastapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.databinding.ActivityGetOtpScreenBinding
import com.padc.thepodcastapp.mvp.impls.OtpPresenterImpl
import com.padc.thepodcastapp.mvp.presenters.OtpPresenter
import com.padc.thepodcastapp.mvp.view.OtpView

class GetOtpScreenActivity : AppCompatActivity(), OtpView {

    private lateinit var mBinding: ActivityGetOtpScreenBinding

    private lateinit var mPresenter: OtpPresenter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, GetOtpScreenActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_otp_screen)
        mBinding = ActivityGetOtpScreenBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setUpPresenters()

        setUpListeners()
    }

    private fun setUpPresenters() {
        mPresenter = ViewModelProvider(this)[OtpPresenterImpl::class.java]
        mPresenter.initPresenter(this)
    }

    private fun setUpListeners() {
        mBinding.btnVerify.setOnClickListener {
            mPresenter.onTapVerifyButton()
        }
        mBinding.ivLeftButtonOtp.setOnClickListener {
            mPresenter.onTapBackButton()
        }
    }

    override fun navigateToPreviousScreen() {
        startActivity(SplashActivity.newIntent(this))
    }

    override fun navigateToSignUpScreen() {
        startActivity(SignUpScreenActivity.newIntent(this))
    }

    override fun showError(error: String) {
       Toast.makeText(this,error,Toast.LENGTH_LONG).show()
    }
}