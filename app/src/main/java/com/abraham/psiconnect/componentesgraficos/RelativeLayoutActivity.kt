package com.abraham.psiconnect.componentesgraficos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.abraham.psiconnect.R

class RelativeLayoutActivity : AppCompatActivity() {
    private lateinit var etUser: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        etUser = findViewById<EditText>(R.id.et_user)
        btnLogin = findViewById<Button>(R.id.btn_login)
        btnRegister = findViewById(R.id.btn_register)

        btnLogin.setOnClickListener {

            val intent = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(intent)
        }

        btnRegister.setOnClickListener {

            val intent = Intent(this, ComponentSelectionActivity::class.java)
            startActivity(intent)
        }



    }
}