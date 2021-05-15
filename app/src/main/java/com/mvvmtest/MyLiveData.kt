package com.mvvmtest

import androidx.lifecycle.LiveData

class MyLiveData : LiveData<String>() {

    fun setValueToLiveData(string : String){
        value = string
    }

    override fun onActive() {
        super.onActive()
    }

    override fun onInactive() {
        super.onInactive()
    }
}