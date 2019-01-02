package com.takhyeongmin.dowadogbeta.presenter.activity

import android.os.Parcel
import android.os.Parcelable
import com.takhyeongmin.dowadogbeta.R
import com.takhyeongmin.dowadogbeta.presenter.BasePresenter
import com.takhyungmin.dowadogbeta.contents.activity.ContentsEduDetailActivity
import com.takhyungmin.dowadogbeta.contents.adapter.ContentsEduDetailItem

class ContentsEduDetailActivityPresenter() : BasePresenter<ContentsEduDetailActivity>(), Parcelable {

    lateinit var contentsEduDetailItems : ArrayList<ContentsEduDetailItem>

    constructor(parcel: Parcel) : this() {

    }

    fun initView(){
        contentsEduDetailItems = ArrayList()

        contentsEduDetailItems.add(ContentsEduDetailItem(R.drawable.pic1, "서브제모오오오오오옥1", "내요옹오오오오오오옹오오오오오오오옹1"))
        contentsEduDetailItems.add(ContentsEduDetailItem(R.drawable.pic1, "서브제모오오오오오옥2", "내요옹오오오오오오옹오오오오오오오옹2"))
        contentsEduDetailItems.add(ContentsEduDetailItem(R.drawable.pic1, "서브제모오오오오오옥3", "내요옹오오오오오오옹오오오오오오오옹3"))
        contentsEduDetailItems.add(ContentsEduDetailItem(R.drawable.pic1, "서브제모오오오오오옥4", "내요옹오오오오오오옹오오오오오오오옹4"))
        contentsEduDetailItems.add(ContentsEduDetailItem(R.drawable.pic1, "서브제모오오오오오옥5", "내요옹오오오오오오옹오오오오오오오옹5"))
        contentsEduDetailItems.add(ContentsEduDetailItem(R.drawable.pic1, "서브제모오오오오오옥6", "내요옹오오오오오오옹오오오오오오오옹6"))




        view!!.initView(contentsEduDetailItems)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ContentsEduDetailActivityPresenter> {
        override fun createFromParcel(parcel: Parcel): ContentsEduDetailActivityPresenter {
            return ContentsEduDetailActivityPresenter(parcel)
        }

        override fun newArray(size: Int): Array<ContentsEduDetailActivityPresenter?> {
            return arrayOfNulls(size)
        }
    }
}