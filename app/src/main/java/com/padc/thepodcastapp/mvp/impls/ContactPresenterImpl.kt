package com.padc.thepodcastapp.mvp.impls

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.padc.thepodcastapp.mvp.presenters.ContactPresenter
import com.padc.thepodcastapp.mvp.view.ContactView

class ContactPresenterImpl : ContactPresenter, ViewModel() {

    private var mView : ContactView? = null
    override fun onTapAddNewContactButton() {
        mView?.navigateToNewContactScreen()
    }

    override fun initPresenter(view: ContactView) {
        mView = view
    }

    override fun onUIReady(context: Context, lifecycleOwner: LifecycleOwner) {
    }

    override fun onTapGroupItem() {
        mView?.navigateToNewGroupScreen()
    }
}