package com.wanted.retocine.UI.View

import android.app.ProgressDialog
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import androidx.lifecycle.Observer
import com.wanted.retocine.Data.LiveData.InternetConnection
import com.wanted.retocine.R
import com.wanted.retocine.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var splashActivityBinding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashActivityBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashActivityBinding.root)
        supportActionBar!!.hide()
        CheckInternetConnection()
    }
    private fun VerifyLoginData() {
        val loginDataSP: SharedPreferences =  getSharedPreferences("LOGIN_DATA_SP",MODE_PRIVATE)
        if(loginDataSP!=null) {
            var user: String = loginDataSP.getString("userName","").toString()
            if(!user.isEmpty())
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
        Handler(Looper.getMainLooper()).postDelayed(
            {
                    val an = AnimationUtils.loadAnimation(this, R.anim.animation)
                    splashActivityBinding.IVLogoSplash.animation = an
                VerifyLoginData()
        }, 500) // 3000 is the delayed time in milliseconds.TODO("Not yet implemented")
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