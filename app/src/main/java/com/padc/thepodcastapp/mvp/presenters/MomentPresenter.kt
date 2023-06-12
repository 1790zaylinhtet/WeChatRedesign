package com.padc.thepodcastapp.mvp.presenters

import androidx.lifecycle.ViewModel
import com.padc.thepodcastapp.mvp.view.LoginView
import com.padc.thepodcastapp.mvp.view.MomentView

interface MomentPresenter : BasePresenter<MomentView> {

    fun onTapNewCreateMomentIcon()
}