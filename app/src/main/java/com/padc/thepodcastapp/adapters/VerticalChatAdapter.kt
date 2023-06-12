package com.padc.thepodcastapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.viewholders.VerticalChatViewHolder

class VerticalChatAdapter : RecyclerView.Adapter<VerticalChatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalChatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_vertical_chat_list,parent,false)
        return VerticalChatViewHolder(view)
    }

    override fun getItemCount(): Int {
       return 10
    }

    override fun onBindViewHolder(holder: VerticalChatViewHolder, position: Int) {
    }
}