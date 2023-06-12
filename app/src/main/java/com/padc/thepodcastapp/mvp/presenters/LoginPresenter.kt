package com.padc.thepodcastapp.mvp.presenters

import com.padc.thepodcastapp.mvp.view.LoginView

interface LoginPresenter : BasePresenter<LoginView> {
    fun onTapBackButton()
    fun onTapLoginButton()
}