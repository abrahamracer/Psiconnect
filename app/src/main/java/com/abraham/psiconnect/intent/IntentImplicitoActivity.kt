package com.abraham.psiconnect.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.abraham.psiconnect.R

class IntentImplicitoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_implicito)
        val btSend = findViewById<Button>(R.id.btSend)
        val btSendUrl = findViewById<Button>(R.id.btSendUrl)
        val btActividad2 =findViewById<Button>(R.id.btActividad2)
        btSend.setOnClickListener {
            Toast.makeText(this,"Estas a punto de enviar un correo ",Toast.LENGTH_LONG).show()
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_SUBJECT,"Aviso Urgente")
                putExtra(Intent.EXTRA_TEXT,"Esto es una prueba de intent implicito para enviar")
            }
            startActivity(Intent.createChooser(emailIntent,"Enviar email.."))
        }

        btSendUrl.setOnClickListener {
            val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
            startActivity(Intent.createChooser(urlIntent,"ver url ..."))
            //Snackbar.make(btSend,"Prueba snack",5000).show()
        }

        btActividad2.setOnClickListener {
            val intent = Intent(this,IntentSendExtrasActivity::class.java)
            startActivity(intent)

        }
    }
}