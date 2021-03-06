package com.takhyungmin.dowadogbeta.mypage

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.bumptech.glide.Glide
import com.takhyeongmin.dowadogbeta.BaseActivity
import com.takhyeongmin.dowadogbeta.R
import kotlinx.android.synthetic.main.activity_mypage_setting.*
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.ByteArrayOutputStream
import java.io.FileNotFoundException
import java.io.InputStream

class MypageSettingActivity : BaseActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        when (v) {
            img_profile_mypage_set_act -> {
                changeImage()
            }
            img_camera_mypage_set_act -> {
                changeImage()
            }
            awwd -> {
                downKeyboard(awwd)
            }
        }
    }


    private val REQ_CODE_SELECT_IMAGE = 100
    lateinit var data: Uri
    private var image: MultipartBody.Part? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage_setting)

        init()
    }

    fun init() {
        img_profile_mypage_set_act.setOnClickListener(this)
        img_camera_mypage_set_act.setOnClickListener(this)

        et_name_mod_mypage_setting_act.setOnClickListener(this)

        //키보드 내려가게 하는 함수
        rl_mypage_setting_act.setOnClickListener(this)

        awwd.setOnClickListener(this)


    }

    fun changeImage() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = android.provider.MediaStore.Images.Media.CONTENT_TYPE
        intent.data = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        startActivityForResult(intent, REQ_CODE_SELECT_IMAGE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQ_CODE_SELECT_IMAGE) {
            if (resultCode == Activity.RESULT_OK) {
                try {
                    //if(ApplicationController.getInstance().is)
                    this.data = data!!.data
                    Log.v("이미지", this.data.toString())

                    val options = BitmapFactory.Options()

                    var input: InputStream? = null // here, you need to get your context.
                    try {
                        input = contentResolver.openInputStream(this.data)
                    } catch (e: FileNotFoundException) {
                        e.printStackTrace()
                    }

                    val bitmap = BitmapFactory.decodeStream(input, null, options) // InputStream 으로부터 Bitmap 을 만들어 준다.
                    val baos = ByteArrayOutputStream()
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 20, baos)
                    val photoBody = RequestBody.create(MediaType.parse("image/jpg"), baos.toByteArray())
                    //val img = File(getRealPathFromURI(this!!, this.data).toString()) // 가져온 파일의 이름을 알아내려고 사용합니다

                    // Log.v("TAG", "이미지 이름 = " + img)
                    Log.v("TAG", "이미지 바디 = " + photoBody.toString())


                    image = MultipartBody.Part.createFormData("image", "image", photoBody)

                    //body = MultipartBody.Part.createFormData("image", photo.getName(), profile_pic);

                    Glide.with(this)
                            .load(this.data.toString())
                            .into(img_profile_mypage_set_act)


                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }
        }
    }

    private fun downKeyboard(view : View) {
        val imm: InputMethodManager = applicationContext!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}

/*
    fun getRealPathFromURI(context: Context, contentUri: Uri): String {
        var cursor: Cursor? = null
        try {
            val proj = arrayOf(MediaStore.Images.Media.DATA)
            cursor = context.contentResolver.query(contentUri, proj, null, null, null)
            val column_index = cursor!!.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
            cursor.moveToFirst()
            return cursor.getString(column_index)
        } finally {
            cursor?.close()
        }
    }
    */


