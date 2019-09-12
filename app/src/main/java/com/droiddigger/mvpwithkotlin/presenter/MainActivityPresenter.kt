package com.droiddigger.mvpwithkotlin.presenter

import com.droiddigger.mvpwithkotlin.contract.ContractInterface
import com.droiddigger.mvpwithkotlin.model.MainActivityModel

class MainActivityPresenter(_view: ContractInterface.View) : ContractInterface.Presenter {
    private var view: ContractInterface.View = _view
    private var model: ContractInterface.Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}