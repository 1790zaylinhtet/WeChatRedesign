package com.padc.thepodcastapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.viewholders.ContactAlphabetGroupViewHolder

class ContactAlphabetGroupAdapter : RecyclerView.Adapter<ContactAlphabetGroupViewHolder>() {

    private var mAlphabetList:List<Char> = listOf()
    private var mNameList:List<String> = listOf()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContactAlphabetGroupViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_alphabet_group_contact,parent,false)
        return ContactAlphabetGroupViewHolder(view)
    }

    override fun getItemCount(): Int {
       return mAlphabetList.size
    }

    override fun onBindViewHolder(holder: ContactAlphabetGroupViewHolder, position: Int) {
        holder.bindData(mAlphabetList[position],mNameList)
    }

    fun setNewData(alphabetList: List<Char>, nameList: List<String>) {
        mAlphabetList = alphabetList
        mNameList = nameList
        notifyDataSetChanged()
    }
}