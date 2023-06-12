package com.padc.thepodcastapp.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padc.thepodcastapp.databinding.ViewHolderPostsBinding

class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private lateinit var mBinding : ViewHolderPostsBinding

    init {
        mBinding = ViewHolderPostsBinding.bind(itemView)
    }
}