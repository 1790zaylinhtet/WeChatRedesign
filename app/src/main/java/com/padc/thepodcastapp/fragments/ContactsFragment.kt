package com.padc.thepodcastapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.thepodcastapp.GeneralListData
import com.padc.thepodcastapp.adapters.AlphabetGroupAdapter
import com.padc.thepodcastapp.adapters.ContactAlphabetGroupAdapter
import com.padc.thepodcastapp.adapters.GroupAdapter
import com.padc.thepodcastapp.databinding.FragmentContactBinding
import com.padc.thepodcastapp.mvp.impls.ContactPresenterImpl
import com.padc.thepodcastapp.mvp.presenters.ContactPresenter
import com.padc.thepodcastapp.mvp.view.ContactView

class ContactsFragment : Fragment(), ContactView {

    private lateinit var mBinding: FragmentContactBinding

    private lateinit var mGroupListAdapter: GroupAdapter
    private lateinit var mAlphabetGroupAdapter: AlphabetGroupAdapter
    private lateinit var mContactAlphabetGroupAdapter: ContactAlphabetGroupAdapter

    private lateinit var mPresenter: ContactPresenter


    private val nameList: List<String> =
        listOf("Zay Lin", "Kyaw Zayar Htwe", "Zin Lin Htet", "Kyaw Zaw Hein", "Kaung Thiha Zaw")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentContactBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpPresenter()

        setUpGroupRecyclerView()
        setUpAlphabetGroupRecyclerView()
        setUpContactAlphabetGroupRecyclerView()
    }

    private fun setUpGroupRecyclerView() {
        mGroupListAdapter = GroupAdapter(mPresenter)
        mBinding.rvGroupList.adapter = mGroupListAdapter
        mBinding.rvGroupList.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
    }

    private fun setUpAlphabetGroupRecyclerView() {
        mAlphabetGroupAdapter = AlphabetGroupAdapter(GeneralListData.getAlphabetList())
        mBinding.rvAlphabetGroup.adapter = mAlphabetGroupAdapter
        mBinding.rvAlphabetGroup.layoutManager = LinearLayoutManager(requireActivity())
    }

    private fun setUpContactAlphabetGroupRecyclerView() {
        mContactAlphabetGroupAdapter = ContactAlphabetGroupAdapter()
        mBinding.rvAlphabetGroupContact.adapter = mContactAlphabetGroupAdapter
        mBinding.rvAlphabetGroupContact.layoutManager = LinearLayoutManager(requireActivity())

        mContactAlphabetGroupAdapter.setNewData(getAlphabetList(nameList), nameList)
    }

    private fun getAlphabetList(nameList: List<String>): List<Char> {
        val nameMapList = nameList.groupBy { it[0] }
        val alphabetList = arrayListOf<Char>()
        for (key in nameMapList.keys) {
            alphabetList.add(key)
        }
        return alphabetList
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProvider(this)[ContactPresenterImpl::class.java]
        mPresenter.initPresenter(this)
    }

    private fun setUpListeners() {
        mBinding.btnAddNewContact.setOnClickListener {
        }
    }

    override fun navigateToNewGroupScreen() {

    }

    override fun navigateToNewContactScreen() {

    }

    override fun showError(error: String) {

    }
}