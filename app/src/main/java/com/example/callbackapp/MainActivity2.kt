package com.example.callbackapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    val act = "Activity2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        toast(this,"onCreate Activity2")
        Log.d(act, "onCreate: ")
    }
    override fun onStart() {
        super.onStart()
        toast(this,"onStart Activity2")
        Log.d(act, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        toast(this,"onResume Activity2")
        Log.d(act, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        toast(this,"onPause Activity2")
        Log.d(act, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        toast(this,"onStop Activity2")
        Log.d(act, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        toast(this,"onDestroy Activity2")
        Log.d(act, "onDestroy: ")
    }

    fun toast(context: Context, str:String)
    {
        Toast.makeText(context,str, Toast.LENGTH_SHORT).show()
    }

}