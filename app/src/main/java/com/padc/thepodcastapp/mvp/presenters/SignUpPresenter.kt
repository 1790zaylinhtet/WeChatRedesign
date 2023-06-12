package com.padc.thepodcastapp.mvp.presenters

import com.padc.thepodcastapp.mvp.view.SignUpView

interface SignUpPresenter : BasePresenter<SignUpView>{

    fun onTapBackButton()

    fun onTapSignUpButton()
}