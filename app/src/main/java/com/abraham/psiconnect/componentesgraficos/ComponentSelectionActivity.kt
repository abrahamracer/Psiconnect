package com.abraham.psiconnect.componentesgraficos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import com.abraham.psiconnect.R

class ComponentSelectionActivity : AppCompatActivity() {
    private lateinit var etFirstName: EditText
    private lateinit var etLastName: EditText
    private lateinit var etEmail: EditText
    private lateinit var rgGender: RadioGroup
    private lateinit var rbMale: RadioButton
    private lateinit var rbFemale: RadioButton
    private lateinit var etPassword: EditText
    private lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component_selection)


                etFirstName = findViewById<EditText>(R.id.etFirstName)
                etLastName = findViewById<EditText>(R.id.etLastName)
                etEmail = findViewById(R.id.etEmail)
                rgGender = findViewById(R.id.rgGender)
                rbMale = findViewById<RadioButton>(R.id.rbMale)
                rbFemale = findViewById(R.id.rbFemale)
                etPassword = findViewById(R.id.etPassword)
                btnRegister = findViewById(R.id.btnRegister)

                btnRegister.setOnClickListener {
                    val firstName = etFirstName.text.toString()
                    val lastName = etLastName.text.toString()
                    val email = etEmail.text.toString()
                    val gender = when {
                        rbMale.isChecked -> "Hombre"
                        rbFemale.isChecked -> "Mujer"
                        else -> "Desconocido"
                    }
                    val password = etPassword.text.toString()


                    val resultMessage =
                        "Nombre: $firstName\nApellido: $lastName\nCorreo electrónico: $email\n" +
                                "Género: $gender\nContraseña: $password"

                    Toast.makeText(this, resultMessage, Toast.LENGTH_LONG).show()
                }
            }
        }

