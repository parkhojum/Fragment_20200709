package com.example.fragment_20200709

import androidx.appcompat.app.AppCompatActivity

abstract class BaesActivity : AppCompatActivity() {

    val mContext = this
    abstract fun setupEvents()
    abstract fun setValues()

}