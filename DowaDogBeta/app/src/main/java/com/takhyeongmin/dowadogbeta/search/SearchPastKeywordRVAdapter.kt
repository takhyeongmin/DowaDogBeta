package com.takhyungmin.dowadogbeta.search

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.takhyeongmin.dowadogbeta.R

class SearchPastKeywordRVAdapter(private var ctx: Context ,private var dataList: ArrayList<String>) : RecyclerView.Adapter<SearchPastKeywordRVAdapter.SearchPastKeywordViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchPastKeywordViewHolder {
        val pastKeywordView  : View = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_search_act_past_keyword, parent, false)
        return SearchPastKeywordViewHolder(pastKeywordView)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: SearchPastKeywordViewHolder, position: Int) {
        holder.pastKeyword.text = dataList[position]
    }

    inner class SearchPastKeywordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView!!){
        var pastKeyword : TextView = itemView!!.findViewById(R.id.tv_past_keyword_rv_item_search_act)
    }
}