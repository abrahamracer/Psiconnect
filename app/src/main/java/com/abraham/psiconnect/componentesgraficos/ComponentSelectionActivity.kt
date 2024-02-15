package com.abraham.psiconnect.componentesgraficos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.abraham.psiconnect.R

class ComponentSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component_selection)

        val cbMarried = findViewById<CheckBox>(R.id.cbMarried)
        val btShow = findViewById<Button>(R.id.btShow)

        cbMarried.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this,"isChecked=$isChecked",Toast.LENGTH_SHORT).show()

        }
        btShow.setOnClickListener {
            val cbStatus= cbMarried.isChecked
            Toast.makeText(this,"isChecked=$cbStatus",Toast.LENGTH_SHORT).show()
        }



    }



}