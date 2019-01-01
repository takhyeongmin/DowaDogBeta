package com.takhyeongmin.dowadogbeta.modifyinfoanimal

import android.os.Bundle
import android.util.Log
import android.view.View
import com.takhyeongmin.dowadogbeta.BaseActivity
import com.takhyeongmin.dowadogbeta.R
import kotlinx.android.synthetic.main.activity_modify_info_animal.*

class ModifyInfoAnimalActivity : BaseActivity(), View.OnClickListener {

    private var cutFlag: Int = 0
    private var firstFlag: Int = 0
    private var secondFlag: Int = 0
    private var thirdFlag: Int = 0
    private var fourthFlag: Int = 0
    private var fifthFlag: Int = 0
    private var sixthFlag: Int = 0

    override fun onClick(v: View?) {

        when (v) {

        // 중성화 버튼
            btn_dog_cut_do_check_modify_info_animal_act -> {
                if (cutFlag == 0) {
                    iv_dog_cut_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_orange)
                    cutFlag = 1

                    iv_dog_cut_dont_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    Log.v("TAG", "4")
                } else {
                    iv_dog_cut_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    cutFlag = 0
                    Log.v("TAG", "3")
                }
            }

            btn_dog_cut_dont_check_modify_info_animal_act -> {
                if (cutFlag == 1) {
                    iv_dog_cut_dont_check_modify_info_animal_act.setImageResource(R.drawable.b_check_orange)
                    cutFlag = 0

                    Log.v("TAG", "1")
                    iv_dog_cut_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                } else {
                    iv_dog_cut_dont_check_modify_info_animal_act.setImageResource(R.drawable.b_check_orange)
                    cutFlag = 1
                    Log.v("TAG", "2")
                }
            }

        // 종합백신 7종
            btn_dog_first_do_check_modify_info_animal_act -> {
                if (firstFlag == 0) {
                    iv_dog_first_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_orange)
                    firstFlag = 1
                } else {
                    iv_dog_first_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    firstFlag = 0
                }
            }

        // 광견병
            btn_dog_second_do_check_modify_info_animal_act -> {
                if (secondFlag == 0) {
                    iv_dog_second_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_orange)
                    secondFlag = 1
                } else {
                    iv_dog_second_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    secondFlag = 0
                }
            }

        // 심장 사상충
            btn_dog_third_do_check_modify_info_animal_act -> {
                if (thirdFlag == 0) {
                    iv_dog_third_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_orange)
                    thirdFlag = 1
                } else {
                    iv_dog_third_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    thirdFlag = 0
                }
            }


        // 코로나 장염
            btn_dog_fourth_do_check_modify_info_animal_act -> {
                if (fourthFlag == 0) {
                    iv_dog_fourth_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_orange)
                    fourthFlag = 1
                } else {
                    iv_dog_fourth_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    fourthFlag = 0
                }
            }

        // 캔넬코프
            btn_dog_fiveth_do_check_modify_info_animal_act -> {
                if (fifthFlag == 0) {
                    iv_dog_fiveth_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_orange)
                    fifthFlag = 1
                } else {
                    iv_dog_fiveth_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    fifthFlag = 0
                }
            }

        // 접종을 아예 하지 않았습니다.
            btn_dog_sixth_do_check_modify_info_animal_act -> {
                if (sixthFlag == 0) {
                    iv_dog_sixth_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_orange)
                    sixthFlag = 1
                    iv_dog_first_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    firstFlag = 0
                    iv_dog_second_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    secondFlag = 0
                    iv_dog_third_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    thirdFlag = 0
                    iv_dog_fourth_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    fifthFlag = 0
                    iv_dog_fiveth_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                } else {
                    iv_dog_sixth_do_check_modify_info_animal_act.setImageResource(R.drawable.b_check_grey)
                    sixthFlag = 0

                }
            }

        // 사진
            btn_my_dog_modify_info_animal_act -> {
                // ## 사진 넣기 해야함
            }

        // 취소 버튼
            btn_cancle_modify_info_animal_act -> {
                finish()
            }

            btn_confirm_modify_info_animal_act -> {
                // ## 확인버튼
            }
        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modify_info_animal)

        init()
    }

    private fun init() {
        btn_dog_cut_do_check_modify_info_animal_act.setOnClickListener(this)
        btn_dog_cut_dont_check_modify_info_animal_act.setOnClickListener(this)
        btn_dog_first_do_check_modify_info_animal_act.setOnClickListener(this)
        btn_dog_second_do_check_modify_info_animal_act.setOnClickListener(this)
        btn_dog_third_do_check_modify_info_animal_act.setOnClickListener(this)
        btn_dog_fourth_do_check_modify_info_animal_act.setOnClickListener(this)
        btn_dog_fiveth_do_check_modify_info_animal_act.setOnClickListener(this)
        btn_dog_sixth_do_check_modify_info_animal_act.setOnClickListener(this)
        btn_cancle_modify_info_animal_act.setOnClickListener(this)
    }
}
