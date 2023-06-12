package com.padc.thepodcastapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.adapters.NewMomentPostBackgroundAdapter
import com.padc.thepodcastapp.databinding.ActivityNewMomentBinding
import com.padc.thepodcastapp.mvp.impls.NewMomentPresenterImpl
import com.padc.thepodcastapp.mvp.presenters.NewMomentPresenter
import com.padc.thepodcastapp.mvp.view.NewMomentView

class NewMomentActivity : AppCompatActivity(),NewMomentView {

    private lateinit var mBinding : ActivityNewMomentBinding

    private lateinit var mAdapter : NewMomentPostBackgroundAdapter

    private lateinit var mPresenter : NewMomentPresenter

    companion object{
        fun newIntent(context : Context) : Intent {
            return Intent(context,NewMomentActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_moment)
        mBinding = ActivityNewMomentBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        setUpPresenter()

        setUpRecyclerView()
        setUpListeners()
    }
    private fun setUpPresenter(){
        mPresenter = ViewModelProvider(this)[NewMomentPresenterImpl::class.java]
        mPresenter.initPresenter(this)
    }
    private fun setUpListeners(){
        mBinding.btnClose.setOnClickListener {
            mPresenter.onTapClose()
        }
        mBinding.btnClose.setOnClickListener {
            mPresenter.onTapCreateButton()
        }
    }

    private fun setUpRecyclerView(){
        mAdapter = NewMomentPostBackgroundAdapter()
        mBinding.rvNewMomentBackground.adapter = mAdapter
        mBinding.rvNewMomentBackground.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
    }

    override fun navigateToMomentScreen() {
        finish()
    }

    override fun navigateToCreateButton() {
        finish()
    }

    override fun showError(error: String) {
        Toast.makeText(this,error,Toast.LENGTH_LONG).show()
    }
}