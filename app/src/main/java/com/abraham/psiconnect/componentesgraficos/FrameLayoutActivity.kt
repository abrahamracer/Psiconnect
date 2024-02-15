package com.abraham.psiconnect.componentesgraficos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.abraham.psiconnect.R

class FrameLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)
        val botonBienvenido = findViewById<Button>(R.id.Btn_Welcome)


        botonBienvenido.setOnClickListener {

            val intent = Intent(this, RelativeLayoutActivity::class.java) // Reemplaza con el nombre correcto de tu nueva actividad
            startActivity(intent)
        }
    }
}