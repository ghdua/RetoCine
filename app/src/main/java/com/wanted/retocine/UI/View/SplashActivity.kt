package com.wanted.retocine.UI.View

import android.app.ProgressDialog
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.Observer
import com.wanted.retocine.LiveData.InternetConnection
import com.wanted.retocine.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar!!.hide()
        CheckInternetConnection()
    }

    private fun VerifyLoginData() {
        val loginDataSP: SharedPreferences =  getSharedPreferences("LOGIN_DATA_SP",MODE_PRIVATE)
        if(loginDataSP!=null)
        {
            var caca: String = loginDataSP.getString("userName","").toString()
            if(!caca.isEmpty())
                GoMain()
            else
                GoLogin()
        }
    }

    private fun GoLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun GoMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun Splash() {
        // Handler().postDelayed({
        Handler(Looper.getMainLooper()).postDelayed(
            {
                VerifyLoginData()
        }, 1000) // 3000 is the delayed time in milliseconds.TODO("Not yet implemented")
    }

    private fun CheckInternetConnection() {
        val InternetConnectionObject = InternetConnection(this)
        InternetConnectionObject.observe(this, Observer
        { IsConnected ->
            if (!IsConnected)
                ShowNoInternetConnection()
            else Splash()
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
}