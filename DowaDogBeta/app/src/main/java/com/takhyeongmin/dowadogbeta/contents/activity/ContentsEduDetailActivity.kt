package com.takhyungmin.dowadogbeta.contents.activity

import android.os.Bundle
import android.support.v4.widget.NestedScrollView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.view.WindowManager
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.takhyeongmin.dowadogbeta.R
import com.takhyeongmin.dowadogbeta.presenter.activity.ContentsEduDetailActivityPresenter
import com.takhyungmin.dowadogbeta.contents.adapter.ContentsEduDetailItem
import com.takhyungmin.dowadogbeta.contents.adapter.ContentsEduDetailRvAdapter
import kotlinx.android.synthetic.main.activity_contents_edu_detail.*


class ContentsEduDetailActivity : AppCompatActivity() {

    private lateinit var contentsEduDetailActivityPresenter: ContentsEduDetailActivityPresenter
    private lateinit var contentsEduDetailRvAdapter: ContentsEduDetailRvAdapter
    private lateinit var requestManager : RequestManager
    override fun onCreate(savedInstanceState: Bundle?) {
        //ActivityCompat.setEnterSharedElementCallback(this, EnterTransitionCallback)
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
        //setTheme(R.style.ContentsDetailActivityBasic)
        //window.statusBarColor = Color.TRANSPARENT
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contents_edu_detail)
        Glide.with(this).load(R.drawable.pic1).into(img_contents_edu_detail)
        tv_contents_edu_detail_title.text = intent.getStringExtra("title")
        rv_contents_edu_detail_content.setFocusable(false)
        layout_edu_detail.requestFocus()
        init()
    }

    private fun init(){
        contentsEduDetailActivityPresenter = ContentsEduDetailActivityPresenter()
        contentsEduDetailActivityPresenter.view = this
        contentsEduDetailActivityPresenter.initView()
        setScrollListener()
    }

    fun initView(contentsEduDetailItems : ArrayList<ContentsEduDetailItem>){
        requestManager = Glide.with(this)
        contentsEduDetailRvAdapter = ContentsEduDetailRvAdapter(contentsEduDetailItems, requestManager)
        rv_contents_edu_detail_content.layoutManager = LinearLayoutManager(this)
        rv_contents_edu_detail_content.adapter = contentsEduDetailRvAdapter
    }

    private fun setScrollListener(){
        sv_contents_edu_detail_scroll.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v, _, scrollY, _, oldScrollY ->
            if (scrollY > oldScrollY + 30) {
                //scroll down
                window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
                layout_contents_edu_detail_toolbar_move.visibility = View.GONE
                layout_contents_edu_detail_toolbar_basic.visibility = View.GONE
                if(scrollY > img_contents_edu_detail.height){
                    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                }

            }
            if (scrollY < oldScrollY - 30) {
                //scroll up
                window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
                window.statusBarColor = this.resources.getColor(R.color.status2)
                layout_contents_edu_detail_toolbar_move.visibility = View.VISIBLE
                if(scrollY < img_contents_edu_detail.height){
                    window.decorView.systemUiVisibility = 0
                    window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
                    layout_contents_edu_detail_toolbar_basic.visibility = View.VISIBLE
                    layout_contents_edu_detail_toolbar_move.visibility = View.GONE
                }
            }

            if (scrollY == 0) {
                //scroll in top
//                window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
//                layout_contents_edu_detail_toolbar_basic.visibility = View.VISIBLE
//                layout_contents_edu_detail_toolbar_move.visibility = View.GONE
            }

            if (scrollY == ( v.getChildAt(0).height - v.height )) {
                //scroll in bottom
                layout_contents_edu_detail_toolbar_move.visibility = View.VISIBLE
            }
        })
    }

//    private val EnterTransitionCallback = object : SharedElementCallback() {
//        @SuppressLint("NewApi")
//        override fun onMapSharedElements(names: List<String>, sharedElements: MutableMap<String, View>) {
//            sharedElements.put(names[0], img_contents_edu_detail)
//        }
//    }

}
