package com.padc.thepodcastapp.mvp.presenters

import com.padc.thepodcastapp.mvp.view.NewMomentView

interface NewMomentPresenter : BasePresenter<NewMomentView> {

    fun onTapClose()

    fun onTapCreateButton()
}