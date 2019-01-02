package com.takhyeongmin.dowadogbeta.presenter.activity

import com.takhyeongmin.dowadogbeta.communitydetail.CommunityDetailActivity
import com.takhyeongmin.dowadogbeta.presenter.BasePresenter

class CommunityDetailActivityPresenter : BasePresenter<CommunityDetailActivity>() {


    fun initView(){

        //이 아래는 추후 모델을 쓸 일이 생기면 그때 바뀔 것.
        val viewPagerItemData: ArrayList<String> = ArrayList()
        viewPagerItemData.add("https://s3.ap-northeast-2.amazonaws.com/liivlive/kb_login_profile_img.png")
        viewPagerItemData.add("https://s3.ap-northeast-2.amazonaws.com/liivlive/kb_login_profile_img.png")
        viewPagerItemData.add("https://s3.ap-northeast-2.amazonaws.com/liivlive/kb_login_profile_img.png")
        viewPagerItemData.add("https://s3.ap-northeast-2.amazonaws.com/liivlive/kb_login_profile_img.png")



        view!!.setViewPagerAdapter(viewPagerItemData)
    }
}