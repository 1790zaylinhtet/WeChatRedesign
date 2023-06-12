package com.padc.thepodcastapp.mvp.impls

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.padc.thepodcastapp.mvp.presenters.SignUpPresenter
import com.padc.thepodcastapp.mvp.view.SignUpView

class SignUpPresenterImpl : SignUpPresenter, ViewModel() {

    private  var mView: SignUpView? = null

    override fun onTapBackButton() {
        mView?.navigateToSplashScreen()
    }

    override fun onTapSignUpButton() {
       mView?.navigateToHomeScreen()
    }

    override fun initPresenter(view: SignUpView) {
        mView = view
    }

    override fun onUIReady(context: Context, lifecycleOwner: LifecycleOwner) {
    }
}