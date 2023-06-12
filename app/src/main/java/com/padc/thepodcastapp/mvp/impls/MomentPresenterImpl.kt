package com.padc.thepodcastapp.mvp.impls

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.padc.thepodcastapp.mvp.presenters.MomentPresenter
import com.padc.thepodcastapp.mvp.view.MomentView

class MomentPresenterImpl : MomentPresenter,ViewModel() {

    private var mView : MomentView? = null
    override fun onTapNewCreateMomentIcon() {
       mView?.navigateToCreateNewMomentScreen()
    }

    override fun initPresenter(view: MomentView) {
      mView = view
    }

    override fun onUIReady(context: Context, lifecycleOwner: LifecycleOwner) {
    }
}