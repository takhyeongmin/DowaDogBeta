package com.takhyungmin.dowadogbeta.presenter.activity

import com.takhyeongmin.dowadogbeta.apply.online.ApplyOnlineFirstActivity
import com.takhyeongmin.dowadogbeta.presenter.BasePresenter

class ApplyOnlineFristActiviyPresenter : BasePresenter<ApplyOnlineFirstActivity>() {

    fun initView(){
        //Model에서 저장된 것들 가져오기.

        view!!.initView()
    }
}