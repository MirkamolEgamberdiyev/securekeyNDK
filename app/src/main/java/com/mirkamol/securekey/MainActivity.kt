package com.mirkamol.securekey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var serverKey = BuildConfig.SERVER_KEY
    init {
        System.loadLibrary("keys")
    }
        external fun getPublicKey():String?
        external fun getPrivateKey():String?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("@@@", "onCreate: $serverKey ")

        Log.d("@@@", getPublicKey().toString())
        Log.d("@@@", getPrivateKey().toString())


    }
}