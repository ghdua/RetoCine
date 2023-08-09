package com.wanted.retocine.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.wanted.retocine.R
import com.wanted.retocine.databinding.ActivityLoginBinding
import kotlin.math.log

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var loginActivityBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        loginActivityBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginActivityBinding.root)
        supportActionBar!!.hide()
        loginActivityBinding.BLoginOk.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var user = loginActivityBinding.ETLoginUser.text
        var password = loginActivityBinding.ETLoginPassword.text
        if(user.isEmpty())
            loginActivityBinding.ETLoginUser.setError("Ingrese usuario")
        if(password.isEmpty())
            loginActivityBinding.ETLoginPassword.setError("Ingrese paassword")
        if(!user.isEmpty() &&
            !password.isEmpty())
        {
            if(user.contains("Admin") && password.contains("Password*123"))
            {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(this, "Usuario y/o contraseña incorrectos", Toast.LENGTH_LONG).show()
        }
    }
}