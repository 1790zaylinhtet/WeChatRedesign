package com.padc.thepodcastapp.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padc.thepodcastapp.databinding.ViewHolderContactListBinding

class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private lateinit var mBinding : ViewHolderContactListBinding

    init {
        mBinding = ViewHolderContactListBinding.bind(itemView)
    }

    fun bindData(name : String){
        mBinding.tvNameContact.text = name
    }
}