package com.padc.thepodcastapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.thepodcastapp.adapters.HorizontalChatAdapter
import com.padc.thepodcastapp.adapters.VerticalChatAdapter
import com.padc.thepodcastapp.databinding.FragmentChatBinding

class ChatFragment : Fragment() {

    private lateinit var mBinding : FragmentChatBinding
    private lateinit var mHorizontalChatAdapter: HorizontalChatAdapter
    private lateinit var mVerticalChatAdapter: VerticalChatAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       mBinding = FragmentChatBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpHorizontalChatRecyclerView()
        setUpVerticalChatRecyclerView()
    }

    private fun setUpHorizontalChatRecyclerView(){
       mHorizontalChatAdapter = HorizontalChatAdapter()
        mBinding.rvHorizontalActiveChat.adapter = mHorizontalChatAdapter
        mBinding.rvHorizontalActiveChat.layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.HORIZONTAL,false)

    }
    private fun setUpVerticalChatRecyclerView(){
        mVerticalChatAdapter = VerticalChatAdapter()
        mBinding.rvVerticalActiveChat.adapter = mVerticalChatAdapter
        mBinding.rvVerticalActiveChat.layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.VERTICAL,false)
    }


}