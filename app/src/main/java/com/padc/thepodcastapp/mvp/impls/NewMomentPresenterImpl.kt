package com.padc.thepodcastapp.mvp.impls

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.padc.thepodcastapp.mvp.presenters.NewMomentPresenter
import com.padc.thepodcastapp.mvp.view.NewMomentView

class NewMomentPresenterImpl : NewMomentPresenter,ViewModel() {

    private var mView : NewMomentView? = null
    override fun onTapClose() {
        mView?.navigateToMomentScreen()
    }

    override fun onTapCreateButton() {
       mView?.navigateToCreateButton()
    }

    override fun initPresenter(view: NewMomentView) {
       mView = view
    }

    override fun onUIReady(context: Context, lifecycleOwner: LifecycleOwner) {
    }
}