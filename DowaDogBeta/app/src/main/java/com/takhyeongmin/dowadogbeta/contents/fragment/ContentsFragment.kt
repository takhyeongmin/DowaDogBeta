package com.takhyungmin.dowadogbeta.contents.fragment

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.takhyeongmin.dowadogbeta.R
import com.takhyeongmin.dowadogbeta.presenter.fragment.ContentsFragmentPresenter
import com.takhyungmin.dowadogbeta.contents.ContentsObject
import com.takhyungmin.dowadogbeta.contents.adapter.ContentsAdapter
import kotlinx.android.synthetic.main.fragment_contents.*

class ContentsFragment : Fragment(){

    lateinit var contentsFragmentPresenter: ContentsFragmentPresenter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_contents, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        contentsFragmentPresenter = ContentsFragmentPresenter()
        contentsFragmentPresenter.view = this
    }

    override fun onStart() {
        super.onStart()
        if(!ContentsObject.isCreated) {
            tab_contents.addTab(tab_contents.newTab().setText("교육"))
            tab_contents.addTab(tab_contents.newTab().setText("상식"))
            tab_contents.setTabTextColors(Color.parseColor("#707070"), Color.parseColor("#ffc233"))
        }
        ContentsObject.isCreated = true
            val tabAdapter = ContentsAdapter(childFragmentManager)

            vp_contents.adapter = tabAdapter
            vp_contents.currentItem = 0
            vp_contents.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_contents))


            tab_contents.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabReselected(tab: TabLayout.Tab?) {
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                }

                override fun onTabSelected(tab: TabLayout.Tab?) {
                    vp_contents.currentItem = tab!!.position
                }
            })
    }
}