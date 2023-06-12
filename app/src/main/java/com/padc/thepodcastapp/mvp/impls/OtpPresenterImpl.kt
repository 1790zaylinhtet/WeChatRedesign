package com.padc.thepodcastapp.mvp.impls

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.padc.thepodcastapp.mvp.presenters.OtpPresenter
import com.padc.thepodcastapp.mvp.view.OtpView

class OtpPresenterImpl : OtpPresenter,ViewModel() {

    private  var mView : OtpView? = null
    override fun onTapBackButton() {
        mView?.navigateToPreviousScreen()
    }

    override fun onTapVerifyButton() {
        mView?.navigateToSignUpScreen()
    }

    override fun initPresenter(view: OtpView) {
        mView = view
    }

    override fun onUIReady(context: Context, lifecycleOwner: LifecycleOwner) {
    }
}