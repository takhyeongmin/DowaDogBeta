package com.takhyungmin.dowadogbeta.filter

import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import com.takhyeongmin.dowadogbeta.BaseActivity
import com.takhyeongmin.dowadogbeta.R
import kotlinx.android.synthetic.main.activity_filter.*

class FilterActivity : BaseActivity(), View.OnClickListener {

    private var isDog = 0
    private var isCat = 0
    private var isAllArea = 0
    private var isSeoul = 0
    private var isGyeongggi = 0
    private var isIncheon = 0
    private var isGangwon = 0
    private var isChungcheong = 0
    private var isJeonla = 0
    private var isGyeongsang = 0
    private var isJeju = 0

    private var areaNum = 0

    override fun onClick(v: View?) {
        when (v) {
            btn_back_filter_act -> {
                finish()
            }
            btn_dog_kinds_filter_act -> {
                if (isDog == 0) {
                    btn_dog_kinds_filter_act.setImageResource(R.drawable.filter_dog_orange_1227)
                    isDog = 1
                } else {
                    btn_dog_kinds_filter_act.setImageResource(R.drawable.filter_dog_gray_1227)
                    isDog = 0
                }
            }
            btn_cat_kinds_filter_act -> {
                if (isCat == 0) {
                    btn_cat_kinds_filter_act.setImageResource(R.drawable.filter_cat_orange_1227)
                    isCat = 1
                } else {
                    btn_cat_kinds_filter_act.setImageResource(R.drawable.filter_cat_gray_1227)
                    isCat = 0
                }
            }
            btn_all_area_filter_act -> {
                if (isAllArea == 0) {
                    btn_all_area_filter_act.setImageResource(R.drawable.filter_orange)
                    isAllArea = 1
                    btn_seoul_filter_act.setImageResource(R.drawable.seoul_gray)
                    isSeoul = 0
                    btn_gyeonggi_filter_act.setImageResource(R.drawable.gyeonggi_gray)
                    isGyeongggi = 0
                    btn_incheon_filter_act.setImageResource(R.drawable.incheon_gray)
                    isIncheon = 0
                    btn_gangwon_filter_act.setImageResource(R.drawable.gangwon_gray)
                    isGangwon = 0
                    btn_chungcheong_filter_act.setImageResource(R.drawable.chungcheong_gray)
                    isChungcheong = 0
                    btn_jeonla_filter_act.setImageResource(R.drawable.jeonla_gray)
                    isJeonla = 0
                    btn_gyeongsang_filter_act.setImageResource(R.drawable.gyeongsang_gray)
                    isGyeongsang = 0
                    btn_jeju_filter_act.setImageResource(R.drawable.jeju_gray)
                    isJeju = 0
                } else {
                    btn_all_area_filter_act.setImageResource(R.drawable.filter_gray)
                    isAllArea = 0
                }
            }
            btn_seoul_filter_act -> {
                if (isSeoul == 0) {
                    btn_all_area_filter_act.setImageResource(R.drawable.filter_gray)
                    isAllArea = 0
                    btn_seoul_filter_act.setImageResource(R.drawable.seoul_orange)
                    isSeoul = 1
                    btn_gyeonggi_filter_act.setImageResource(R.drawable.gyeonggi_gray)
                    isGyeongggi = 0
                    btn_incheon_filter_act.setImageResource(R.drawable.incheon_gray)
                    isIncheon = 0
                    btn_gangwon_filter_act.setImageResource(R.drawable.gangwon_gray)
                    isGangwon = 0
                    btn_chungcheong_filter_act.setImageResource(R.drawable.chungcheong_gray)
                    isChungcheong = 0
                    btn_jeonla_filter_act.setImageResource(R.drawable.jeonla_gray)
                    isJeonla = 0
                    btn_gyeongsang_filter_act.setImageResource(R.drawable.gyeongsang_gray)
                    isGyeongsang = 0
                    btn_jeju_filter_act.setImageResource(R.drawable.jeju_gray)
                    isJeju = 0
                } else {
                    btn_seoul_filter_act.setImageResource(R.drawable.seoul_gray)
                    isSeoul = 0
                }
            }
            btn_gyeonggi_filter_act -> {
                if (isGyeongggi == 0) {
                    btn_gyeonggi_filter_act.setImageResource(R.drawable.gyeonggi_orange)
                    isGyeongggi = 1
                    btn_seoul_filter_act.setImageResource(R.drawable.seoul_gray)
                    isSeoul = 0
                    btn_all_area_filter_act.setImageResource(R.drawable.filter_gray)
                    isAllArea = 0
                    btn_incheon_filter_act.setImageResource(R.drawable.incheon_gray)
                    isIncheon = 0
                    btn_gangwon_filter_act.setImageResource(R.drawable.gangwon_gray)
                    isGangwon = 0
                    btn_chungcheong_filter_act.setImageResource(R.drawable.chungcheong_gray)
                    isChungcheong = 0
                    btn_jeonla_filter_act.setImageResource(R.drawable.jeonla_gray)
                    isJeonla = 0
                    btn_gyeongsang_filter_act.setImageResource(R.drawable.gyeongsang_gray)
                    isGyeongsang = 0
                    btn_jeju_filter_act.setImageResource(R.drawable.jeju_gray)
                    isJeju = 0
                } else {
                    btn_gyeonggi_filter_act.setImageResource(R.drawable.gyeonggi_gray)
                    isGyeongggi = 0
                }
            }
            btn_incheon_filter_act -> {
                if (isIncheon == 0) {
                    btn_incheon_filter_act.setImageResource(R.drawable.incheon_orange)
                    isIncheon = 1
                    btn_seoul_filter_act.setImageResource(R.drawable.seoul_gray)
                    isSeoul = 0
                    btn_all_area_filter_act.setImageResource(R.drawable.filter_gray)
                    isAllArea = 0
                    btn_gyeonggi_filter_act.setImageResource(R.drawable.gyeonggi_gray)
                    isGyeongggi = 0
                    btn_gangwon_filter_act.setImageResource(R.drawable.gangwon_gray)
                    isGangwon = 0
                    btn_chungcheong_filter_act.setImageResource(R.drawable.chungcheong_gray)
                    isChungcheong = 0
                    btn_jeonla_filter_act.setImageResource(R.drawable.jeonla_gray)
                    isJeonla = 0
                    btn_gyeongsang_filter_act.setImageResource(R.drawable.gyeongsang_gray)
                    isGyeongsang = 0
                    btn_jeju_filter_act.setImageResource(R.drawable.jeju_gray)
                    isJeju = 0
                } else {
                    btn_incheon_filter_act.setImageResource(R.drawable.incheon_gray)
                    isIncheon = 0
                }
            }
            btn_gangwon_filter_act -> {
                if (isGangwon == 0) {
                    btn_gangwon_filter_act.setImageResource(R.drawable.gangwon_orange)
                    isGangwon = 1
                    btn_seoul_filter_act.setImageResource(R.drawable.seoul_gray)
                    isSeoul = 0
                    btn_all_area_filter_act.setImageResource(R.drawable.filter_gray)
                    isAllArea = 0
                    btn_gyeonggi_filter_act.setImageResource(R.drawable.gyeonggi_gray)
                    isGyeongggi = 0
                    btn_incheon_filter_act.setImageResource(R.drawable.incheon_gray)
                    isIncheon = 0
                    btn_chungcheong_filter_act.setImageResource(R.drawable.chungcheong_gray)
                    isChungcheong = 0
                    btn_jeonla_filter_act.setImageResource(R.drawable.jeonla_gray)
                    isJeonla = 0
                    btn_gyeongsang_filter_act.setImageResource(R.drawable.gyeongsang_gray)
                    isGyeongsang = 0
                    btn_jeju_filter_act.setImageResource(R.drawable.jeju_gray)
                    isJeju = 0
                } else {
                    btn_gangwon_filter_act.setImageResource(R.drawable.gangwon_gray)
                    isGangwon = 0
                }
            }
            btn_chungcheong_filter_act -> {
                if (isChungcheong == 0) {
                    btn_chungcheong_filter_act.setImageResource(R.drawable.chungcheong_orange)
                    isChungcheong = 1
                    btn_seoul_filter_act.setImageResource(R.drawable.seoul_gray)
                    isSeoul = 0
                    btn_all_area_filter_act.setImageResource(R.drawable.filter_gray)
                    isAllArea = 0
                    btn_gyeonggi_filter_act.setImageResource(R.drawable.gyeonggi_gray)
                    isGyeongggi = 0
                    btn_incheon_filter_act.setImageResource(R.drawable.incheon_gray)
                    isIncheon = 0
                    btn_gangwon_filter_act.setImageResource(R.drawable.gangwon_gray)
                    isGangwon = 0
                    btn_jeonla_filter_act.setImageResource(R.drawable.jeonla_gray)
                    isJeonla = 0
                    btn_gyeongsang_filter_act.setImageResource(R.drawable.gyeongsang_gray)
                    isGyeongsang = 0
                    btn_jeju_filter_act.setImageResource(R.drawable.jeju_gray)
                    isJeju = 0
                } else {
                    btn_chungcheong_filter_act.setImageResource(R.drawable.chungcheong_gray)
                    isChungcheong = 0
                }
            }
            btn_jeonla_filter_act -> {
                if(isJeonla == 0){
                    btn_jeonla_filter_act.setImageResource(R.drawable.jeonla_orange)
                    isJeonla = 1
                    btn_seoul_filter_act.setImageResource(R.drawable.seoul_gray)
                    isSeoul = 0
                    btn_all_area_filter_act.setImageResource(R.drawable.filter_gray)
                    isAllArea = 0
                    btn_gyeonggi_filter_act.setImageResource(R.drawable.gyeonggi_gray)
                    isGyeongggi = 0
                    btn_incheon_filter_act.setImageResource(R.drawable.incheon_gray)
                    isIncheon = 0
                    btn_gangwon_filter_act.setImageResource(R.drawable.gangwon_gray)
                    isGangwon = 0
                    btn_chungcheong_filter_act.setImageResource(R.drawable.chungcheong_gray)
                    isChungcheong = 0
                    btn_gyeongsang_filter_act.setImageResource(R.drawable.gyeongsang_gray)
                    isGyeongsang = 0
                    btn_jeju_filter_act.setImageResource(R.drawable.jeju_gray)
                    isJeju = 0
                } else {
                    btn_jeonla_filter_act.setImageResource(R.drawable.jeonla_gray)
                    isJeonla = 0
                }
            }
            btn_gyeongsang_filter_act -> {
                if(isGyeongsang == 0){
                    btn_gyeongsang_filter_act.setImageResource(R.drawable.gyeongsang_orange)
                    isGyeongsang = 1
                    btn_seoul_filter_act.setImageResource(R.drawable.seoul_gray)
                    isSeoul = 0
                    btn_all_area_filter_act.setImageResource(R.drawable.filter_gray)
                    isAllArea = 0
                    btn_gyeonggi_filter_act.setImageResource(R.drawable.gyeonggi_gray)
                    isGyeongggi = 0
                    btn_incheon_filter_act.setImageResource(R.drawable.incheon_gray)
                    isIncheon = 0
                    btn_gangwon_filter_act.setImageResource(R.drawable.gangwon_gray)
                    isGangwon = 0
                    btn_chungcheong_filter_act.setImageResource(R.drawable.chungcheong_gray)
                    isChungcheong = 0
                    btn_jeonla_filter_act.setImageResource(R.drawable.jeonla_gray)
                    isJeonla = 0
                    btn_jeju_filter_act.setImageResource(R.drawable.jeju_gray)
                    isJeju = 0
                } else {
                    btn_gyeongsang_filter_act.setImageResource(R.drawable.gyeongsang_gray)
                    isGyeongsang = 0
                }
            }
            btn_jeju_filter_act -> {
                if(isJeju == 0){
                    btn_jeju_filter_act.setImageResource(R.drawable.jeju_orange)
                    isJeju = 1
                    btn_seoul_filter_act.setImageResource(R.drawable.seoul_gray)
                    isSeoul = 0
                    btn_all_area_filter_act.setImageResource(R.drawable.filter_gray)
                    isAllArea = 0
                    btn_gyeonggi_filter_act.setImageResource(R.drawable.gyeonggi_gray)
                    isGyeongggi = 0
                    btn_incheon_filter_act.setImageResource(R.drawable.incheon_gray)
                    isIncheon = 0
                    btn_gangwon_filter_act.setImageResource(R.drawable.gangwon_gray)
                    isGangwon = 0
                    btn_chungcheong_filter_act.setImageResource(R.drawable.chungcheong_gray)
                    isChungcheong = 0
                    btn_jeonla_filter_act.setImageResource(R.drawable.jeonla_gray)
                    isJeonla = 0
                    btn_gyeongsang_filter_act.setImageResource(R.drawable.gyeongsang_gray)
                    isGyeongsang = 0
                } else {
                    btn_jeju_filter_act.setImageResource(R.drawable.jeju_gray)
                    isJeju = 0
                }
            }
            btn_confirm_filter_act -> {
                // 통신코드
            }
            btn_return_filter_act -> {
                btn_jeju_filter_act.setImageResource(R.drawable.jeju_gray)
                isJeju = 0
                btn_seoul_filter_act.setImageResource(R.drawable.seoul_gray)
                isSeoul = 0
                btn_all_area_filter_act.setImageResource(R.drawable.filter_gray)
                isAllArea = 0
                btn_gyeonggi_filter_act.setImageResource(R.drawable.gyeonggi_gray)
                isGyeongggi = 0
                btn_incheon_filter_act.setImageResource(R.drawable.incheon_gray)
                isIncheon = 0
                btn_gangwon_filter_act.setImageResource(R.drawable.gangwon_gray)
                isGangwon = 0
                btn_chungcheong_filter_act.setImageResource(R.drawable.chungcheong_gray)
                isChungcheong = 0
                btn_jeonla_filter_act.setImageResource(R.drawable.jeonla_gray)
                isJeonla = 0
                btn_gyeongsang_filter_act.setImageResource(R.drawable.gyeongsang_gray)
                isGyeongsang = 0

                btn_dog_kinds_filter_act.setImageResource(R.drawable.filter_dog_gray_1227)
                isDog = 0

                btn_cat_kinds_filter_act.setImageResource(R.drawable.filter_cat_gray_1227)
                isCat = 0

                sb_term_filter_act.progress = 15
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)
        init()
        setSeekBarListener()
    }

    fun init() {
        btn_dog_kinds_filter_act.setOnClickListener(this)
        btn_cat_kinds_filter_act.setOnClickListener(this)
        btn_all_area_filter_act.setOnClickListener(this)
        btn_seoul_filter_act.setOnClickListener(this)
        btn_gyeonggi_filter_act.setOnClickListener(this)
        btn_incheon_filter_act.setOnClickListener(this)
        btn_gangwon_filter_act.setOnClickListener(this)
        btn_chungcheong_filter_act.setOnClickListener(this)
        btn_jeonla_filter_act.setOnClickListener(this)
        btn_gyeongsang_filter_act.setOnClickListener(this)
        btn_jeju_filter_act.setOnClickListener(this)
        btn_confirm_filter_act.setOnClickListener(this)
        btn_return_filter_act.setOnClickListener(this)
        btn_back_filter_act.setOnClickListener(this)
    }

    fun setSeekBarListener(){
        sb_term_filter_act.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                // Seekbar의 최소값을 바꿀 수 없으므로 +1로 계산해서 사용
               var realProgress = progress + 1
                if(realProgress == 16){
                    tv_term_last_filter_act.text = progress.toString() + "일 이상"
                }else {
                    tv_term_last_filter_act.text = realProgress.toString() + "일"
                }

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })
    }
}
