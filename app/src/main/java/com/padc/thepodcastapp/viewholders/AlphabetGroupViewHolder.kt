package com.padc.thepodcastapp.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padc.thepodcastapp.databinding.ViewHolderAlphabetListBinding

class AlphabetGroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private lateinit var mBinding : ViewHolderAlphabetListBinding

    init {
        mBinding = ViewHolderAlphabetListBinding.bind(itemView)
    }

    fun bindData(alphabet : Char){
        mBinding.tvAlphabet.text = alphabet.toString()
    }
}