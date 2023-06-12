package com.padc.thepodcastapp.mvp.presenters

import com.padc.thepodcastapp.mvp.view.OtpView

interface OtpPresenter : BasePresenter<OtpView> {
    fun onTapBackButton()

    fun onTapVerifyButton()
}