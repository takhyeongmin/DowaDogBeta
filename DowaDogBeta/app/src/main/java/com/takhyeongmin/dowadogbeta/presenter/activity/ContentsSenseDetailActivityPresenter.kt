package com.takhyeongmin.dowadogbeta.presenter.activity

import com.takhyeongmin.dowadogbeta.R
import com.takhyeongmin.dowadogbeta.presenter.BasePresenter
import com.takhyungmin.dowadogbeta.contents.activity.ContentsSenseDetailActivity
import com.takhyungmin.dowadogbeta.contents.adapter.ContentsSenseDetailItem


class ContentsSenseDetailActivityPresenter : BasePresenter<ContentsSenseDetailActivity>() {

    lateinit var contentsSenseDetailItems : ArrayList<ContentsSenseDetailItem>

    fun initView(){
        contentsSenseDetailItems = ArrayList()

        contentsSenseDetailItems.add(ContentsSenseDetailItem(R.drawable.pic1, "서브제모오오오오오옥1", "내요옹오오오오오오옹오오오오오오오옹1"))
        contentsSenseDetailItems.add(ContentsSenseDetailItem(R.drawable.pic1, "서브제모오오오오오옥2", "내요옹오오오오오오옹오오오오오오오옹2"))
        contentsSenseDetailItems.add(ContentsSenseDetailItem(R.drawable.pic1, "서브제모오오오오오옥3", "내요옹오오오오오오옹오오오오오오오옹3"))
        contentsSenseDetailItems.add(ContentsSenseDetailItem(R.drawable.pic1, "서브제모오오오오오옥4", "내요옹오오오오오오옹오오오오오오오옹4"))
        contentsSenseDetailItems.add(ContentsSenseDetailItem(R.drawable.pic1, "서브제모오오오오오옥5", "내요옹오오오오오오옹오오오오오오오옹5"))
        contentsSenseDetailItems.add(ContentsSenseDetailItem(R.drawable.pic1, "서브제모오오오오오옥6", "내요옹오오오오오오옹오오오오오오오옹6"))




        view!!.initView(contentsSenseDetailItems)
    }
}