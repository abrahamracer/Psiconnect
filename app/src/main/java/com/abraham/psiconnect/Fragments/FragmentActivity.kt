package com.abraham.psiconnect.Fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abraham.psiconnect.R

class FragmentActivity : AppCompatActivity(), LoginFragment.OnGoToRegisterListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {

            showLoginFragment()
        }
    }


    private fun showLoginFragment() {
        val loginFragment = LoginFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, loginFragment)
            .commit()
    }


    private fun showRegisterFragment() {
        val registerFragment = RegisterFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, registerFragment)
            .addToBackStack(null)
            .commit()
    }


    override fun onGoToRegisterClicked() {
        showRegisterFragment()
    }
}