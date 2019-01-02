package com.takhyeongmin.dowadogbeta.presenter.fragment

import com.takhyeongmin.dowadogbeta.presenter.BasePresenter
import com.takhyungmin.dowadogbeta.home.fragment.HomeFragmentLargeSecondSlide

class HomeFragmentLargeSecondSlidePresenter : BasePresenter<HomeFragmentLargeSecondSlide>() {

    fun init(){
        view!!.init()
    }

    fun changeIndicator(position : Int){
        view!!.changeIndicator(position)
    }
}