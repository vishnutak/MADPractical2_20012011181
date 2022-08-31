package com.example.madpractical_20012011181

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val Tag="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate function called.")
    }
    private fun showMessage(msg:String){
        Log.i(Tag,msg)
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        Snackbar.make(findViewById(R.id.main_constraint_layout),msg,Snackbar.LENGTH_LONG).show()
    }
    override fun onStart(){
        showMessage("onStart function called.")
        super.onStart()
    }
    override fun onResume(){
        showMessage("onResume function called.")
        super.onResume()
    }
    override fun onPause(){
        showMessage("onPause function called.")
        super.onPause()
    }
    override fun onRestart(){
        showMessage("onRestart function called.")
        super.onRestart()
    }
    override fun onStop(){
        showMessage("onStop function called.")
        super.onStop()
    }
}