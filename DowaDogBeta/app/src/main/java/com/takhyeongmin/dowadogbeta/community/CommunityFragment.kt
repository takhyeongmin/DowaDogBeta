package com.takhyeongmin.dowadogbeta.community

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.takhyeongmin.dowadogbeta.R
import com.takhyeongmin.dowadogbeta.community.adapter.CommunityAdapter
import com.takhyeongmin.dowadogbeta.community.model.CommunityItem
import com.takhyeongmin.dowadogbeta.presenter.fragment.CommunityFragmentPresenter
import kotlinx.android.synthetic.main.fragment_community.*

class CommunityFragment : Fragment() {

    lateinit var communityFragmentPresenter : CommunityFragmentPresenter
    lateinit var requestManager: RequestManager
    lateinit var communityAdapter : CommunityAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_community, container, false)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communityFragmentPresenter = CommunityFragmentPresenter()
        communityFragmentPresenter.view = this
        requestManager = Glide.with(this)
    }

    override fun onStart() {
        super.onStart()
        communityFragmentPresenter.initView()
    }

    fun initView(communityItems : ArrayList<CommunityItem>){
        communityAdapter = CommunityAdapter(communityItems, requestManager, communityFragmentPresenter, context!!)
        //contentsEduRvAdapter.setOnItemClickListener(this)
        rv_community_feeds.layoutManager = LinearLayoutManager(activity)
        rv_community_feeds.adapter = communityAdapter
    }

}