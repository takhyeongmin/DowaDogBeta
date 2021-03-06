package com.takhyeongmin.dowadogbeta.presenter.fragment

import com.takhyeongmin.dowadogbeta.R
import com.takhyeongmin.dowadogbeta.community.CommunityFragment
import com.takhyeongmin.dowadogbeta.community.model.CommunityItem
import com.takhyeongmin.dowadogbeta.presenter.BasePresenter

class CommunityFragmentPresenter : BasePresenter<CommunityFragment>() {

    lateinit var communityItems : ArrayList<CommunityItem>

    fun initView(){
        communityItems = ArrayList()

        communityItems.add(CommunityItem(R.drawable.pic1, "이름1", arrayListOf(R.drawable.pic1), "제목이 블라블라1", "1시간시간"))
        communityItems.add(CommunityItem(R.drawable.pic1, "이름2", arrayListOf(R.drawable.pic1, R.drawable.pic1, R.drawable.pic1), "제목이 블라블라2", "2시간시간"))
        communityItems.add(CommunityItem(R.drawable.pic1, "이름3", arrayListOf(R.drawable.pic1, R.drawable.pic1), "제목이 블라블라3", "3시간시간"))
        communityItems.add(CommunityItem(R.drawable.pic1, "이름4", arrayListOf(R.drawable.pic1, R.drawable.pic1, R.drawable.pic1, R.drawable.pic1), "제목이 블라블라4", "4시간시간"))
        communityItems.add(CommunityItem(R.drawable.pic1, "이름5", arrayListOf(R.drawable.pic1, R.drawable.pic1, R.drawable.pic1), "제목이 블라블라5", "5시간시간"))
        communityItems.add(CommunityItem(R.drawable.pic1, "이름6", arrayListOf(R.drawable.pic1, R.drawable.pic1), "제목이 블라블라6", "6시간시간"))
        communityItems.add(CommunityItem(R.drawable.pic1, "이름7", arrayListOf(R.drawable.pic1), "제목이 블라블라7", "7시간시간"))


        view!!.initView(communityItems)
    }

}