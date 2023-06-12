package com.padc.thepodcastapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.padc.thepodcastapp.R
import com.padc.thepodcastapp.databinding.ActivitySignUpScreenBinding
import com.padc.thepodcastapp.mvp.impls.SignUpPresenterImpl
import com.padc.thepodcastapp.mvp.presenters.SignUpPresenter
import com.padc.thepodcastapp.mvp.view.SignUpView
import java.util.Calendar

class SignUpScreenActivity : AppCompatActivity(),SignUpView {

    private lateinit var mBinding : ActivitySignUpScreenBinding

    private lateinit var mPresenter : SignUpPresenter

    private var day = ""
    private var month = ""
    private var year = ""
    private var gender = ""

    companion object{
        fun newIntent(context : Context) : Intent{
            return Intent(context,SignUpScreenActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)
        mBinding = ActivitySignUpScreenBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setUpPresenter()

        setUpListeners()
        setUpSpinners()
        setUpRadioGroup()


    }

    private fun setUpListeners(){
        setUpYearSpinner()
        mBinding.btnSignUp.setOnClickListener {
            mPresenter.onTapSignUpButton()
        }
        mBinding.ivLeftButtonSignUp.setOnClickListener {
            mPresenter.onTapBackButton()
        }

    }

    private fun setUpPresenter(){
        mPresenter = ViewModelProvider(this)[SignUpPresenterImpl::class.java]
        mPresenter.initPresenter(this)
    }

    private fun setUpRadioGroup(){
        mBinding.rdMale.setOnCheckedChangeListener { button, isChecked ->
            if (isChecked){
                gender = "Male"
                Toast.makeText(this,gender,Toast.LENGTH_LONG).show()
            }
        }
        mBinding.rdFemale.setOnCheckedChangeListener { button, isChecked ->
            if (isChecked){
                gender = "Female"
                Toast.makeText(this,gender,Toast.LENGTH_LONG).show()
            }
        }
        mBinding.rdOther.setOnCheckedChangeListener { button, isChecked ->
            if (isChecked){
                gender = "Other"
                Toast.makeText(this,gender,Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun setUpYearSpinner(){
        val years = arrayListOf("Year")
        val thisYear =Calendar.getInstance().get(Calendar.YEAR)
        for (year in 1990 .. thisYear){
            years.add(year.toString())
        }

        val adapter = ArrayAdapter(
            this,
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            years
        )
        mBinding.yearSpinner.adapter = adapter
    }

    private fun setUpSpinners(){
        mBinding.daysSpinner.onItemSelectedListener = object : OnItemSelectedListener {

            override fun onItemSelected(adapter: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (position > 0){
                   day = adapter?.getItemAtPosition(position).toString()
                    Toast.makeText(this@SignUpScreenActivity,day,Toast.LENGTH_LONG).show()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }

        mBinding.monthSpinner.onItemSelectedListener = object : OnItemSelectedListener{
            override fun onItemSelected(adapter: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (position > 0){
                    month = adapter?.getItemAtPosition(position).toString()
                    Toast.makeText(this@SignUpScreenActivity,month,Toast.LENGTH_LONG).show()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        mBinding.yearSpinner.onItemSelectedListener = object : OnItemSelectedListener{
            override fun onItemSelected(adapter: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (position > 0){
                    year = adapter?.getItemAtPosition(position).toString()
                    Toast.makeText(this@SignUpScreenActivity,year,Toast.LENGTH_LONG).show()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    override fun navigateToSplashScreen() {
        startActivity(SplashActivity.newIntent(this))
    }

    override fun navigateToHomeScreen() {
        startActivity(HomeActivity.newIntent(this))
    }

    override fun showError(error: String) {
       Toast.makeText(this,error,Toast.LENGTH_LONG).show()
    }
}