package com.example.callbackapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val act = "Activity1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast(this, "onCreate Activity1")
        Log.d(act, "onCreate:")
        val btnacti2 = findViewById<Button>(R.id.btnacti2)
        btnacti2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)

            }

        })
    }

    override fun onStart() {
        super.onStart()
        toast(this, "onStart Activity1")
        Log.d(act, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        toast(this, "onResume Activity 1")
        Log.d(act, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        toast(this, "onPause Activity 1")
        Log.d(act, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        toast(this, "onStop Activity 1")
        Log.d(act, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        toast(this, "onDestroy Activity 1")
        Log.d(act, "onDestroy: ")
    }

    fun toast(context: Context, str: String) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
    }
}