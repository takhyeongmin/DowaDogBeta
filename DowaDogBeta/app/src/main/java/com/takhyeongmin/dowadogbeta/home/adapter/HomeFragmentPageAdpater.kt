package com.takhyungmin.dowadogbeta.home.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.takhyungmin.dowadogbeta.home.fragment.HomeFragmentFirstSlide
import com.takhyungmin.dowadogbeta.home.fragment.HomeFragmentFourthSlide
import com.takhyungmin.dowadogbeta.home.fragment.HomeFragmentSecondSlide
import com.takhyungmin.dowadogbeta.home.fragment.HomeFragmentThirdSlide

class HomeFragmentPageAdpater(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {

    private val contentsCount = 4

    override fun getItem(position: Int) : Fragment =
        when(position){
            0 -> HomeFragmentFirstSlide()
            1 -> HomeFragmentSecondSlide()
            2 -> HomeFragmentThirdSlide()
            else -> HomeFragmentFourthSlide()
        }


    override fun getCount(): Int = contentsCount
}