package com.padc.thepodcastapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.viewholders.AlphabetGroupViewHolder

class AlphabetGroupAdapter(private val alphabetList: List<Char>) : RecyclerView.Adapter<AlphabetGroupViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlphabetGroupViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_alphabet_list,parent,false)
        return AlphabetGroupViewHolder(view)
    }

    override fun getItemCount(): Int {
       return alphabetList.size
    }

    override fun onBindViewHolder(holder: AlphabetGroupViewHolder, position: Int) {
        holder.bindData(alphabetList[position])
    }
}