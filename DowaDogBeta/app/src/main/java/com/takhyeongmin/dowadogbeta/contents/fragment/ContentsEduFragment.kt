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
import com.takhyeongmin.dowadogbeta.presenter.fragment.ContentsEduFragmentPresenter
import com.takhyungmin.dowadogbeta.contents.activity.ContentsEduDetailActivity
import com.takhyungmin.dowadogbeta.contents.adapter.ContentsEduItem
import com.takhyungmin.dowadogbeta.contents.adapter.ContentsEduRvAdapter
import kotlinx.android.synthetic.main.fragment_contents_edu.*


class ContentsEduFragment : Fragment(){

    lateinit var contentsEduFragmentPresenter : ContentsEduFragmentPresenter
    lateinit var requestManager: RequestManager
    lateinit var contentsEduRvAdapter: ContentsEduRvAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_contents_edu, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        //ActivityCompat.setExitSharedElementCallback(activity!!, ExitTransitionCallback)
        super.onCreate(savedInstanceState)
        contentsEduFragmentPresenter = ContentsEduFragmentPresenter()
        contentsEduFragmentPresenter.view = this
        requestManager = Glide.with(this)
    }

    override fun onStart() {
        super.onStart()
        contentsEduFragmentPresenter.initView()
    }

    fun initView(contentsItems : ArrayList<ContentsEduItem>){
        contentsEduRvAdapter = ContentsEduRvAdapter(contentsItems, requestManager, contentsEduFragmentPresenter, context!!)
        //contentsEduRvAdapter.setOnItemClickListener(this)
        rv_contents_edu_feeds.layoutManager = LinearLayoutManager(activity)
        rv_contents_edu_feeds.adapter = contentsEduRvAdapter
    }

    fun toDetail(title : String, sub : String){
        val intent = Intent(context, ContentsEduDetailActivity::class.java)
        intent.putExtra("title", title)
                .putExtra("sub", sub)
        activity!!.startActivity(intent)
    }

//    override fun onClick(v: View?) {
//        val intent = Intent(context, ContentsEduDetailActivity::class.java)
//        val position = rv_contents_edu_feeds.getChildAdapterPosition(v!!)
//        //intent.putExtra("title", items)
//        activity!!.startActivity(intent)
//    }

//    private val ExitTransitionCallback = object : SharedElementCallback() {
//        override fun onMapSharedElements(names: List<String>, sharedElements: MutableMap<String, View>) {
//            //sharedElements.put(names[0], contentsEduRvAdapter.getViewAtIndex(rv_contents_edu_feeds, ContentsEduDetailActivity.SelectedIndex)!!)
//            ContentsEduDetailActivity.SelectedIndex = -1
//        }
//    }


//    override fun onViewStateRestored(savedInstanceState: Bundle?) {
//        super.onViewStateRestored(savedInstanceState)
//        if (savedInstanceState != null) {
//            val savedRecyclerLayoutState = savedInstanceState.getParcelable<Parcelable>("contents")
//            rv_contents_edu_feeds.layoutManager!!.onRestoreInstanceState(savedRecyclerLayoutState)
//        }
//    }
//
//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        outState.putParcelable("contents", rv_contents_edu_feeds.layoutManager!!.onSaveInstanceState())
//    }
//
//    override fun onPause() {
//        super.onPause()
//        currentVisiblePosition = (rv_contents_edu_feeds.layoutManager as LinearLayoutManager).findFirstCompletelyVisibleItemPosition()
//        ContentsObject.position = currentVisiblePosition
//    }
//
//    override fun onResume() {
//        super.onResume()
//        (rv_contents_edu_feeds.layoutManager as LinearLayoutManager).scrollToPosition(ContentsObject.position)
//        currentVisiblePosition = 0
//    }
}