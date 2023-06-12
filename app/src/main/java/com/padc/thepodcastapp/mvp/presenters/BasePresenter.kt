package com.padc.thepodcastapp.mvp.presenters

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import com.padc.thepodcastapp.mvp.view.BaseView

interface BasePresenter<V : BaseView> {

    fun initPresenter(view: V)
    fun onUIReady(context: Context, lifecycleOwner: LifecycleOwner)
}