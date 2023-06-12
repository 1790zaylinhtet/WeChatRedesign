package com.padc.thepodcastapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.viewholders.HorizontalChatViewHolder

class HorizontalChatAdapter : RecyclerView.Adapter<HorizontalChatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalChatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_horizontal_chat_list,parent,false)
        return HorizontalChatViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: HorizontalChatViewHolder, position: Int) {

    }
}