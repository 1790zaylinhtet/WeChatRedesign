package com.padc.thepodcastapp.viewholders

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.padc.thepodcastapp.adapters.ContactAdapter
import com.padc.thepodcastapp.databinding.ViewHolderAlphabetGroupContactBinding

class ContactAlphabetGroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private lateinit var mBinding : ViewHolderAlphabetGroupContactBinding

    private lateinit var mContactAdapter : ContactAdapter

    init {
        mBinding = ViewHolderAlphabetGroupContactBinding.bind(itemView)
        setUpContactRecyclerView()
    }

    private fun setUpContactRecyclerView(){
        mContactAdapter = ContactAdapter()
        mBinding.rvContacts.adapter = mContactAdapter
        mBinding.rvContacts.layoutManager =LinearLayoutManager(itemView.context)
    }

    fun bindData(firstAlphabet : Char,nameList : List<String>){
        mBinding.tvAlphabetContacts.text =firstAlphabet.toString()

        val names = arrayListOf<String>()
        for (name in nameList){
            if (firstAlphabet == name[0]){
                names.add(name)
            }
        }
        mContactAdapter.setNewData(names)
    }
}