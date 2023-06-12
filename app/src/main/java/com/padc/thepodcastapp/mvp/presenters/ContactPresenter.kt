package com.padc.thepodcastapp.mvp.presenters

import com.padc.thepodcastapp.delegates.GroupItemDelegate
import com.padc.thepodcastapp.mvp.view.ContactView

interface ContactPresenter : BasePresenter<ContactView>,GroupItemDelegate {

    fun onTapAddNewContactButton()
}