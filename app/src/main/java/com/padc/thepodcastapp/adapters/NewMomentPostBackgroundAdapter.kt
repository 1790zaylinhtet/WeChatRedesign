package com.padc.thepodcastapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.viewholders.NewMomentPostBackgroundViewHolder

class NewMomentPostBackgroundAdapter : RecyclerView.Adapter<NewMomentPostBackgroundViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NewMomentPostBackgroundViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_new_moment_post_background,parent,false)
        return NewMomentPostBackgroundViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(holder: NewMomentPostBackgroundViewHolder, position: Int) {
    }
}