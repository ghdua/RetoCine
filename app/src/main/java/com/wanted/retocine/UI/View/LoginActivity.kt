package com.wanted.retocine.UI.View

import android.app.ProgressDialog
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import com.wanted.retocine.Data.LiveData.InternetConnection
import com.wanted.retocine.Data.LiveData.VerifyInternetConnection
import com.wanted.retocine.R
import com.wanted.retocine.databinding.ActivityLoginBinding
import kotlin.math.log

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var loginActivityBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginActivityBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginActivityBinding.root)
        supportActionBar!!.hide()
        loginActivityBinding.BLoginOk.setOnClickListener(this)
        CheckInternetConnection()
    }

    private fun CheckInternetConnection() {
        val InternetConnectionObject = InternetConnection(this)
        InternetConnectionObject.observe(this, Observer
        { IsConnected ->
            if (!IsConnected)
                ShowNoInternetConnection()
        })
    }

    fun ShowNoInternetConnection()
    {
        var PDNoInternetConnection: ProgressDialog = ProgressDialog(this)
        PDNoInternetConnection.setCancelable(false)
        PDNoInternetConnection.setIcon(R.drawable.disconnectednetwork)
        PDNoInternetConnection.setTitle(getString(R.string.NoInternetTitleSpa))
        PDNoInternetConnection.setMessage(getString(R.string.NoInternetMessageSpa))
        val NetworkConnectionObject = InternetConnection(this)
        NetworkConnectionObject.observe(this, Observer { IsConnected ->
            if (IsConnected)
                PDNoInternetConnection.dismiss()
            else
                PDNoInternetConnection.show()
        })
    }

    override fun onClick(p0: View?) {
        var user: String = loginActivityBinding.ETLoginUser.text.toString()
        var password: String = loginActivityBinding.ETLoginPassword.text.toString()
        if(user.isEmpty())
            loginActivityBinding.ETLoginUser.setError("Ingrese usuario")
        if(password.isEmpty())
            loginActivityBinding.ETLoginPassword.setError("Ingrese paassword")
        if(!user.isEmpty() &&
            !password.isEmpty()) {
            if(user.contains("Admin") && password.contains("Password*123")) {
                SaveLoginData(user)
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            else
                Toast.makeText(this, "Usuario y/o contraseña incorrectos", Toast.LENGTH_LONG).show()
        }
    }

    private fun SaveLoginData(pUser: String) {
        val loginDataSP: SharedPreferences =  getSharedPreferences("LOGIN_DATA_SP", MODE_PRIVATE)
        var editor: SharedPreferences.Editor = loginDataSP.edit()
        editor.putString("userName", pUser)
        editor.commit()
    }
}