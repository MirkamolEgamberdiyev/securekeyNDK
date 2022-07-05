package com.mirkamol.securekey

import android.app.Application
import android.util.Log

class App : Application() {
    init {
        System.loadLibrary("keys")
    }

    external fun getPublicKey(): String?
    external fun getPrivateKey(): String?
    override fun onCreate() {
        super.onCreate()
        Log.d("@@@", getPublicKey().toString())
        Log.d("@@@", getPrivateKey().toString())

    }
}