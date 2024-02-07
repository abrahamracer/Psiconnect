package com.abraham.psiconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.abraham.psiconnect.intent.IntentImplicitoActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Ciclo_Vida","estoy en onCreate")
        Toast.makeText(this,"estoy en onCreate",Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.e("Ciclo_Vida","estoy en onStart")
        Toast.makeText(this,"estoy en onStart",Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Log.e("Ciclo_Vida","estoy en onResume")
        //Toast.makeText(this,"Esto es un toast",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"estoy en onResume",Toast.LENGTH_SHORT).show()


        val intent =Intent(this, IntentImplicitoActivity::class.java)
        startActivity(intent)
    }
    override fun onPause() {
        super.onPause()
        Log.e("Ciclo_Vida","estoy en onPause")
        Toast.makeText(this,"estoy en onPause",Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Log.e("Ciclo_Vida","estoy en onStop")
        Toast.makeText(this,"estoy en onStop",Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        super.onRestart()
        Log.e("Ciclo_Vida","estoy en onRestart")
        Toast.makeText(this,"estoy en onRestart",Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("Ciclo_Vida","estoy en onDestroy")
        Toast.makeText(this,"estoy en onDestroy",Toast.LENGTH_SHORT).show()
    }
}