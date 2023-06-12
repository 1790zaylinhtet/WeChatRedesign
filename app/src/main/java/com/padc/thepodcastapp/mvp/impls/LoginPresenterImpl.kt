package com.padc.thepodcastapp.mvp.impls

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.padc.thepodcastapp.mvp.presenters.LoginPresenter
import com.padc.thepodcastapp.mvp.view.LoginView

class LoginPresenterImpl : LoginPresenter,ViewModel() {

    private  var mView : LoginView? = null
    override fun onTapBackButton() {
        mView?.navigateToPreviousScreen()
    }

    override fun onTapLoginButton() {
       mView?.navigateToHomeScreen()
    }

    override fun initPresenter(view: LoginView) {
        mView = view
    }

    override fun onUIReady(context: Context, lifecycleOwner: LifecycleOwner) {

    }
}
