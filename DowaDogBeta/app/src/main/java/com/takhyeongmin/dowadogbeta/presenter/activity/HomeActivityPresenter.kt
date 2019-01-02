package com.takhyeongmin.dowadogbeta.presenter.activity

import android.support.v4.app.Fragment
import com.takhyeongmin.dowadogbeta.presenter.BasePresenter
import com.takhyungmin.dowadogbeta.home.activity.HomeActivity
import com.takhyungmin.dowadogbeta.home.fragment.HomeFragment

class HomeActivityPresenter : BasePresenter<HomeActivity>() {

    fun initView(){
        view!!.addFragment(HomeFragment())
    }

    fun replaceFragment(fragment : Fragment){
        view!!.replaceFragment(fragment)
    }

    fun adjustDim(percent : Float){
        view!!.adjustDim(percent)
    }

}