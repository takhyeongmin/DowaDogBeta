package com.takhyeongmin.dowadogbeta.presenter.fragment

import com.takhyeongmin.dowadogbeta.presenter.BasePresenter
import com.takhyungmin.dowadogbeta.home.fragment.HomeFragment

class HomeFragmentPresenter : BasePresenter<HomeFragment>() {
    fun init(){
        view!!.init()
    }

    fun changeIndicator(position : Int){
        view!!.changeIndicator(position)
    }

    fun swipeEnable(position : Int){
        view!!.swipeEnable(position)
    }
}