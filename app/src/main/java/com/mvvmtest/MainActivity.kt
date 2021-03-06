package com.mvvmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.*
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    lateinit var  mViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this, R.id.nav_host)
        mViewModel = ViewModelProvider(this, MainFactory(application, "Factory")).get(MainViewModel::class.java)
    }

    override fun onStart() {
        super.onStart()
        mViewModel.liveData.observe(this, Observer {
            test_text1.text = it
        })
    }
}