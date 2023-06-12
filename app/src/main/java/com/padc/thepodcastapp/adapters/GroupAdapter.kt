package com.padc.thepodcastapp.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.databinding.ViewHolderGroupBinding
import com.padc.thepodcastapp.delegates.GroupItemDelegate
import com.padc.thepodcastapp.viewholders.GroupViewHolder

class GroupAdapter(private val mDelegate : GroupItemDelegate) : RecyclerView.Adapter<GroupViewHolder>() {
    private lateinit var mBinding : ViewHolderGroupBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_group,parent,false)
        return GroupViewHolder(view,mDelegate)
    }

    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        if (position == 0){
            mBinding = ViewHolderGroupBinding.bind(holder.itemView)
            mBinding.llGroupItem.setBackgroundResource(R.drawable.background_group_list_accent)
            mBinding.ivGroupPhoto.setImageResource(R.drawable.dummy_group_example_photo)
            mBinding.tvGroupName.text= "Add New"
            mBinding.tvGroupName.setTextColor(Color.WHITE)

            holder.itemView.setOnClickListener {
                mDelegate.onTapGroupItem()
            }
        }
    }
}