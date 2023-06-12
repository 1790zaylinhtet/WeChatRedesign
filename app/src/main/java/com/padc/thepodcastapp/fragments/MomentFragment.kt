package com.padc.thepodcastapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.thepodcastapp.activities.NewMomentActivity
import com.padc.thepodcastapp.adapters.PostAdapter
import com.padc.thepodcastapp.databinding.FragmentMomentBinding
import com.padc.thepodcastapp.mvp.impls.MomentPresenterImpl
import com.padc.thepodcastapp.mvp.presenters.MomentPresenter
import com.padc.thepodcastapp.mvp.view.MomentView

class MomentFragment : Fragment() ,MomentView{

    private lateinit var mBinding : FragmentMomentBinding

    private lateinit var mPresenter : MomentPresenter

    private lateinit var mAdapter : PostAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMomentBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpPresenter()

        setUpRecyclerView()
        setUpListeners()
    }

    private fun setUpPresenter(){
        mPresenter = ViewModelProvider(this)[MomentPresenterImpl::class.java]
        mPresenter.initPresenter(this)
    }
    private fun setUpListeners(){
        mBinding.btnNewCreateMoment.setOnClickListener {
            mPresenter.onTapNewCreateMomentIcon()
        }
    }

    override fun navigateToCreateNewMomentScreen() {
        startActivity(NewMomentActivity.newIntent(requireActivity()))
    }

    override fun showError(error: String) {
       Toast.makeText(requireActivity(),error,Toast.LENGTH_LONG).show()
    }

    private fun setUpRecyclerView(){
        mAdapter = PostAdapter()
        mBinding.rvPosts.adapter = mAdapter
        mBinding.rvPosts.layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.VERTICAL,false)
    }
}