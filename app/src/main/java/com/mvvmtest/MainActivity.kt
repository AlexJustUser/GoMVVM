package com.mvvmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(object : Any(){}.javaClass.enclosingMethod?.name)
    }

    override fun onStart() {
        println(object : Any(){}.javaClass.enclosingMethod?.name)
        super.onStart()
    }

    override fun onResume() {
        println(object : Any(){}.javaClass.enclosingMethod?.name)
        super.onResume()
    }

    override fun onPause() {
        println(object : Any(){}.javaClass.enclosingMethod?.name)
        super.onPause()
    }

    override fun onStop() {
        println(object : Any(){}.javaClass.enclosingMethod?.name)
        super.onStop()
    }

    override fun onDestroy() {
        println(object : Any(){}.javaClass.enclosingMethod?.name)
        super.onDestroy()
    }

}