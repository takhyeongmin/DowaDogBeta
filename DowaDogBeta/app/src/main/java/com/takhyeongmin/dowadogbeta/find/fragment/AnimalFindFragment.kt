package com.takhyungmin.dowadogbeta.find.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.takhyeongmin.dowadogbeta.R
import com.takhyeongmin.dowadogbeta.presenter.fragment.AnimalFindFragmentPresenter
import com.takhyungmin.dowadogbeta.find.adapter.AnimalFindNewAdapter
import com.takhyungmin.dowadogbeta.find.adapter.AnimalFindUrgentAdapter
import com.takhyungmin.dowadogbeta.urgent.UrgentAnimalData
import kotlinx.android.synthetic.main.fragment_find.*

class AnimalFindFragment : Fragment() {
    lateinit var animalFindFragmentPresenter : AnimalFindFragmentPresenter
    lateinit var animalFindNewAdapter : AnimalFindNewAdapter
    lateinit var animlaFindUrgnetAdapter : AnimalFindUrgentAdapter
    lateinit var urgentRequestManager : RequestManager
    lateinit var newRequestManager : RequestManager


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_find, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        animalFindFragmentPresenter = AnimalFindFragmentPresenter()
        animalFindFragmentPresenter.view = this
        animalFindFragmentPresenter.init()
    }

    fun init(urgentItems : ArrayList<UrgentAnimalData>, newItems : ArrayList<UrgentAnimalData>){
        urgentRequestManager = Glide.with(this)
        newRequestManager = Glide.with(this)

        animalFindNewAdapter = AnimalFindNewAdapter(newItems, newRequestManager, animalFindFragmentPresenter)
        animlaFindUrgnetAdapter = AnimalFindUrgentAdapter(urgentItems, urgentRequestManager, animalFindFragmentPresenter)


        rv_find_fragment_new.layoutManager = GridLayoutManager(context, 2)
        rv_find_fragment_urgent.layoutManager = GridLayoutManager(context, 2)

        rv_find_fragment_new.adapter = animalFindNewAdapter
        rv_find_fragment_urgent.adapter = animlaFindUrgnetAdapter

    }
}