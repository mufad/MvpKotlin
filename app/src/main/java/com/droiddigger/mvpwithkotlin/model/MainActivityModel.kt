package com.droiddigger.mvpwithkotlin.model

import com.droiddigger.mvpwithkotlin.contract.ContractInterface

class MainActivityModel : ContractInterface.Model {
    private var mCounter = 0

    override fun getCounter() = mCounter

    override fun incrementCounter() {
        mCounter++
    }
}