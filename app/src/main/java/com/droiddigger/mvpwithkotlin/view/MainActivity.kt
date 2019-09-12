package com.droiddigger.mvpwithkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.droiddigger.mvpwithkotlin.R
import com.droiddigger.mvpwithkotlin.contract.ContractInterface
import com.droiddigger.mvpwithkotlin.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , ContractInterface.View {

    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        clickButton.setOnClickListener { presenter?.incrementValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }
}
