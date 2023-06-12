package com.padc.thepodcastapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.padc.thepodcastapp.databinding.FragmentSetttingBinding

class SettingFragment : Fragment() {
    private lateinit var mBinding : FragmentSetttingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentSetttingBinding.inflate(layoutInflater)
        return mBinding.root
    }
}