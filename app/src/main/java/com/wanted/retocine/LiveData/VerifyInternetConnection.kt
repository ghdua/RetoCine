package com.wanted.retocine.LiveData

import android.app.ProgressDialog
import android.content.Context
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.wanted.retocine.R

class VerifyInternetConnection(private val PContext: Context) : LifecycleOwner {
    fun CheckInternetConnection() {
        val InternetConnectionObject = InternetConnection(PContext)
        InternetConnectionObject.observe(this, Observer
        { IsConnected ->
            if (!IsConnected)
                ShowNoInternetConnection()
        })
    }

    fun ShowNoInternetConnection()
    {
        var PDNoInternetConnection: ProgressDialog = ProgressDialog(PContext)
        PDNoInternetConnection.setCancelable(false)
        PDNoInternetConnection.setIcon(R.drawable.disconnectednetwork)
        PDNoInternetConnection.setTitle(PContext.getString(R.string.NoInternetTitleSpa))
        PDNoInternetConnection.setMessage(PContext.getString(R.string.NoInternetMessageSpa))
        val NetworkConnectionObject = InternetConnection(PContext)
        NetworkConnectionObject.observe(this, Observer { IsConnected ->
            if (IsConnected)
                PDNoInternetConnection.dismiss()
            else
                PDNoInternetConnection.show()
        })
    }

    override val lifecycle: Lifecycle
        get() = TODO("Not yet implemented")
}