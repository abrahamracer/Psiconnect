package com.abraham.psiconnect.Fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.abraham.psiconnect.R
import com.abraham.psiconnect.componentesgraficos.ComponentSelectionActivity
import com.abraham.psiconnect.componentesgraficos.ConstraintLayoutActivity





class LoginFragment : Fragment() {
    interface OnGoToRegisterListener {
        fun onGoToRegisterClicked()

    }

    private lateinit var etUser: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnRegister: Button
    private var listener: OnGoToRegisterListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is OnGoToRegisterListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnGoToRegisterListener")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_relative_layout, container, false)

        etUser = view.findViewById(R.id.et_user)
        btnLogin = view.findViewById(R.id.btn_login)
        btnRegister = view.findViewById(R.id.btn_register)

        btnLogin.setOnClickListener {
            val intent = Intent(requireContext(), ConstraintLayoutActivity::class.java)
            startActivity(intent)
        }

        btnRegister.setOnClickListener {

            listener?.onGoToRegisterClicked()
        }

        return view
    }
}