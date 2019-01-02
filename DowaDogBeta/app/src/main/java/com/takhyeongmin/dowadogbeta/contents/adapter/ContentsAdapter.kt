package com.takhyungmin.dowadogbeta.contents.adapter

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.takhyungmin.dowadogbeta.contents.fragment.ContentsEduFragment
import com.takhyungmin.dowadogbeta.contents.fragment.ContentsSenseFragment

class ContentsAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {

    private val contentsCount = 2

    override fun getItem(p0: Int) =
            if (p0 == 0)
                ContentsEduFragment()
            else ContentsSenseFragment()

    override fun getCount(): Int = contentsCount
}