package com.vaca.shareprefhelper

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var sharedPrefHelper: SharedPrefHelper? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPrefHelper = SharedPrefHelper.newInstance(applicationContext)
//        sharedPrefHelper!!.putStringValue("name", "vaca")
        val dada= sharedPrefHelper!!.readStringValue("name", "223")
        Log.e("vaca", "onCreate: $dada" )
    }
}