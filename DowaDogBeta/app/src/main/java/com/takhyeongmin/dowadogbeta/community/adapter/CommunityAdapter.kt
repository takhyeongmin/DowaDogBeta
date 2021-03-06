package com.takhyeongmin.dowadogbeta.community.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.RequestManager
import com.takhyeongmin.dowadogbeta.R
import com.takhyeongmin.dowadogbeta.community.model.CommunityItem
import com.takhyeongmin.dowadogbeta.presenter.fragment.CommunityFragmentPresenter
import com.takhyeongmin.dowadogbeta.utils.CustomDialog

class CommunityAdapter(var communityItems : ArrayList<CommunityItem>, var requestManager: RequestManager, var communityFragmentPresenter: CommunityFragmentPresenter, var context : Context) : RecyclerView.Adapter<CommunityViewHolder>() {

    lateinit var customDialog : CustomDialog

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CommunityViewHolder {
        val mainView = LayoutInflater.from(parent.context).inflate(R.layout.fragment_community_item, parent,false)
        //mainView.setOnClickListener(onItemClick)
        return CommunityViewHolder(mainView)
    }

    override fun getItemCount(): Int = communityItems.size

    override fun onBindViewHolder(holder: CommunityViewHolder, position: Int) {
        holder.communityName.text = communityItems[position].communityName
        requestManager.load(communityItems[position].communityProfile).into(holder.communityProfile)
        holder.communityTime.text = communityItems[position].communityTime
        holder.communityMore.setOnClickListener {
            loadDialog()
        }
        when(communityItems[position].communityImage.size){
            1->{
                holder.communityMain1.visibility = View.VISIBLE
                holder.communityMain2.visibility = View.GONE
                holder.communityMain3.visibility = View.GONE
                holder.communityMain4.visibility = View.GONE

                requestManager.load(communityItems[position].communityImage[0])
                        .into(holder.communityMain1)
            }
            2->{
                holder.communityMain1.visibility = View.GONE
                holder.communityMain2.visibility = View.VISIBLE
                holder.communityMain3.visibility = View.GONE
                holder.communityMain4.visibility = View.GONE

                requestManager.load(communityItems[position].communityImage[0])
                        .into(holder.communityMain21)
                requestManager.load(communityItems[position].communityImage[1])
                        .into(holder.communityMain22)
            }
            3->{
                holder.communityMain1.visibility = View.GONE
                holder.communityMain2.visibility = View.GONE
                holder.communityMain3.visibility = View.VISIBLE
                holder.communityMain4.visibility = View.GONE

                requestManager.load(communityItems[position].communityImage[0])
                        .into(holder.communityMain31)
                requestManager.load(communityItems[position].communityImage[1])
                        .into(holder.communityMain32)
                requestManager.load(communityItems[position].communityImage[2])
                        .into(holder.communityMain33)
            }
            4->{
                holder.communityMain1.visibility = View.GONE
                holder.communityMain2.visibility = View.GONE
                holder.communityMain3.visibility = View.VISIBLE
                holder.communityMain4.visibility = View.VISIBLE

                requestManager.load(communityItems[position].communityImage[0])
                        .into(holder.communityMain31)
                requestManager.load(communityItems[position].communityImage[1])
                        .into(holder.communityMain32)
                requestManager.load(communityItems[position].communityImage[2])
                        .into(holder.communityMain33)
            }
        }
    }

    fun loadDialog() {
        val content = "신고"
        customDialog = CustomDialog(context, content, leftListener, rightListener, "취소", "확인")
        customDialog.show()
    }

    private val leftListener = View.OnClickListener {

        customDialog.dismiss()
    }

    private val rightListener = View.OnClickListener {
        //데이터 저장, 통신, 뷰 변경..
        customDialog.dismiss()
    }
}