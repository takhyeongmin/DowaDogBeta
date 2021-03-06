package com.takhyungmin.dowadogbeta.contents.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.takhyeongmin.dowadogbeta.R
import com.takhyeongmin.dowadogbeta.presenter.fragment.ContentsSenseFragmentPresenter
import com.takhyungmin.dowadogbeta.contents.activity.ContentsSenseDetailActivity
import com.takhyungmin.dowadogbeta.contents.adapter.ContentsSenseItem
import com.takhyungmin.dowadogbeta.contents.adapter.ContentsSenseRvAdapter
import kotlinx.android.synthetic.main.fragment_contents_sense.*

class ContentsSenseFragment : Fragment() {

    lateinit var contentsSenseFragmentPresenter : ContentsSenseFragmentPresenter
    lateinit var requestManager: RequestManager
    lateinit var contentsSenseRvAdapter: ContentsSenseRvAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_contents_sense, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        //ActivityCompat.setExitSharedElementCallback(activity!!, ExitTransitionCallback)
        super.onCreate(savedInstanceState)
        contentsSenseFragmentPresenter = ContentsSenseFragmentPresenter()
        contentsSenseFragmentPresenter.view = this
        requestManager = Glide.with(this)
    }

    override fun onStart() {
        super.onStart()
        contentsSenseFragmentPresenter.initView()
    }

    fun initView(contentsItems : ArrayList<ContentsSenseItem>){
        contentsSenseRvAdapter = ContentsSenseRvAdapter(contentsItems, requestManager, contentsSenseFragmentPresenter)
        //contentsEduRvAdapter.setOnItemClickListener(this)
        rv_contents_sense_feeds.layoutManager = LinearLayoutManager(activity)
        rv_contents_sense_feeds.adapter = contentsSenseRvAdapter
    }

    fun toDetail(title : String, sub : String){
        val intent = Intent(context, ContentsSenseDetailActivity::class.java)
        intent.putExtra("title", title)
                .putExtra("sub", sub)
        activity!!.startActivity(intent)
    }


}