package com.abraham.psiconnect.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.abraham.psiconnect.R

class IntentSendExtrasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_send_extras)

        val btSendExtras = findViewById<Button>(R.id.btSendExtras)

        btSendExtras.setOnClickListener {
            val sendIntent = Intent(this,IntentRecieveExtrasActivity::class.java).apply {
                putExtra("EXTRA_NAME","Abraham")
                putExtra("EXTRA_LAST_NAME","Valderrabano")
                putExtra("EXTRA_AGE",24)
                putExtra("EXTRA_IS_MARRIED",false)
                putExtra("EXTRA_PERSON",Persona("ABRAHAM","AVV"))
            }
            //sendIntent.putExtra("KEY_1","String")


            //startActivity(sendIntent)
            resultRegister.launch(sendIntent)
        }
    }


    private val resultRegister = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        when (result.resultCode) {
            RESULT_OK -> {
                val isValid = result.data?.getBooleanExtra("EXTRA_IS_VALID", false) ?: false
                showResult("Operación exitosa", "Es válido: $isValid")
            }
            RESULT_CANCELED -> {
                showResult("Operación cancelada", "La operación fue cancelada ")
            }
            else -> {
                showResult("Error", "Código de resultado desconocido: ${result.resultCode}")
            }
        }
    }

    private fun showResult(title: String, message: String) {
        Toast.makeText(this, "$title\n$message", Toast.LENGTH_LONG).show()
    }
}

//private val resultRegister = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){result->
//    if(result.resultCode == AppCompatActivity.RESULT_OK){
//        Toast.makeText(this,"resultCode=${result.resultCode},es valido?: ${result.data?.getBooleanExtra("EXTRA_IS_VALID",false)}",Toast.LENGTH_LONG).show()
//    }else{
//        Toast.makeText(this,"CANCELLED",Toast.LENGTH_LONG).show()

//    }

//}