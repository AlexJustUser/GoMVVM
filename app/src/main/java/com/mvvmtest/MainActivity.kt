package com.mvvmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private var myLiveData = MyLiveData()
    lateinit var observer : Observer<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observer = Observer {
            test_text1.text = it
        }

        button_save.setOnClickListener {
            myLiveData.setValueToLiveData(edit_text.text.toString())
        }

    }

    override fun onStart() {
        super.onStart()
        myLiveData.observe(this, observer)
    }

    override fun onStop() {
        super.onStop()
        myLiveData.removeObserver(observer)
    }
}