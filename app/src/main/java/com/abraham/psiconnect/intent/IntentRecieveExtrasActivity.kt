package com.abraham.psiconnect.intent

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.abraham.psiconnect.R

class IntentRecieveExtrasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_recieve_extras)

        val name = intent.getStringExtra("EXTRA_NAME")
        val lastName=intent.getStringExtra("EXTRA_LAST_NAME")
        val age= intent.getIntExtra("EXTRA_AGE",0)
        val married=intent.getBooleanExtra("EXTRA_IS_MARRIED",false)
        val persona=if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.TIRAMISU){
            intent.getSerializableExtra("EXTRA_PERSON",Persona::class.java)
        }else{
            intent.getSerializableExtra("EXTRA_PERSON") as Persona
        }

        val tvInfo = findViewById<TextView>(R.id.tv_info)

        tvInfo.text = "Texto ejemplo a mostrar"
        tvInfo.text="Mi nombre es: $name $lastName,mi edad es: $age y ${if (married) "estoy casado" else "no estoy casado"}, mi alias es: ${persona?.alias?:"no hay alias"}"

        val btReturnInfo = findViewById<Button>(R.id.btReturnInfo)
        btReturnInfo.setOnClickListener {
            val resultIntent = Intent().apply {
                putExtra("EXTRA_IS_VALID",true)
            }
            setResult(RESULT_OK,resultIntent)
            finish()

        }



    }
}