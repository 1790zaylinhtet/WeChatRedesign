package com.padc.thepodcastapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.viewholders.ContactViewHolder

class ContactAdapter : RecyclerView.Adapter<ContactViewHolder>() {

    private var mNameList: List<String> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_contact_list, parent, false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mNameList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bindData(mNameList[position])
    }

    fun setNewData(nameList: List<String>) {
        mNameList = nameList
        notifyDataSetChanged()
    }
}