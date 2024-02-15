package com.abraham.psiconnect.componentesgraficos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.abraham.psiconnect.R
import com.abraham.psiconnect.componentesgraficos.recycledview.RecycledViewActivity

class ConstraintLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)
        val botonServicios = findViewById<Button>(R.id.btnTherapy)
        val botonPsicologos= findViewById<Button>(R.id.btnDirectory)

        botonServicios.setOnClickListener {
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
        }
        botonPsicologos.setOnClickListener {
            val intent=Intent(this,RecycledViewActivity::class.java)
            startActivity(intent)
        }
    }
}