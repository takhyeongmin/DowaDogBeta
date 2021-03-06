package com.takhyungmin.dowadogbeta.home.activity

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import com.jakewharton.rxbinding2.view.clicks
import com.takhyeongmin.dowadogbeta.R
import com.takhyeongmin.dowadogbeta.apply.online.ApplyOnlineMainActivity
import com.takhyeongmin.dowadogbeta.community.CommunityFragment
import com.takhyeongmin.dowadogbeta.presenter.activity.HomeActivityPresenter
import com.takhyungmin.dowadogbeta.contents.fragment.ContentsFragment
import com.takhyungmin.dowadogbeta.find.fragment.AnimalFindFragment
import com.takhyungmin.dowadogbeta.home.HomeObject
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.navi_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var homeActivityPresenter : HomeActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initPresenter()
        homeActivityPresenter.initView()
        setBinding()

    }


    fun initPresenter(){
        homeActivityPresenter = HomeActivityPresenter()
        homeActivityPresenter.view = this
        HomeObject.homeActivityPresenter = homeActivityPresenter
    }

    fun addFragment(fragment : Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.add(R.id.frame_home, fragment)
        transaction.commitNow()
    }

    fun replaceFragment(fragment : Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.replace(R.id.frame_home, fragment)
        transaction.commitNow()
    }

    fun setBinding(){
//        btn_home_drawer.clicks().subscribe {
//            if (!drawer_home.isDrawerOpen(Gravity.START))
//                drawer_home.openDrawer(Gravity.START)
//        }
        btn_home_drawer.setOnClickListener {
            if (!drawer_home.isDrawerOpen(Gravity.START))
                drawer_home.openDrawer(Gravity.START)
        }

        btn_navi_home.setOnClickListener {
            btn_home_mypage.visibility = View.VISIBLE
            if (!drawer_home.isDrawerOpen(Gravity.START))
                drawer_home.openDrawer(Gravity.START)
        }

        btn_navi_contents.setOnClickListener {
            homeActivityPresenter.replaceFragment(ContentsFragment())
            btn_home_mypage.visibility = View.GONE
            tv_home_title.text = "컨텐츠"
            if (drawer_home.isDrawerOpen(Gravity.START))
                drawer_home.closeDrawer(Gravity.START)
        }

        btn_navi_community.setOnClickListener {
            homeActivityPresenter.replaceFragment(CommunityFragment())
            btn_home_mypage.visibility = View.GONE
            tv_home_title.text = "커뮤니티"
            if (drawer_home.isDrawerOpen(Gravity.START))
                drawer_home.closeDrawer(Gravity.START)
        }

        btn_navi_adopt.setOnClickListener {
            if (drawer_home.isDrawerOpen(Gravity.START))
                drawer_home.closeDrawer(Gravity.START)
            startActivity(Intent(this, ApplyOnlineMainActivity::class.java))
        }



        btn_navi_adopt_info.clicks().subscribe {
            homeActivityPresenter.replaceFragment(AnimalFindFragment())
            btn_home_mypage.visibility = View.GONE
            tv_home_title.text = "동물 찾기"
            btn_home_search.visibility = View.VISIBLE
            if (drawer_home.isDrawerOpen(Gravity.START))
                drawer_home.closeDrawer(Gravity.START)
        }

    }

    fun adjustDim(percent : Float){
        layout_home_dim.alpha = percent
    }
}
