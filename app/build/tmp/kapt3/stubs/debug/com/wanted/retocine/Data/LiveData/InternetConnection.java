package com.wanted.retocine.Data.LiveData;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0003J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/wanted/retocine/Data/LiveData/InternetConnection;", "Landroidx/lifecycle/LiveData;", "", "PContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ConnectivityManagerObject", "Landroid/net/ConnectivityManager;", "NetworkCallbackObject", "Landroid/net/ConnectivityManager$NetworkCallback;", "NetworkReceiver", "Landroid/content/BroadcastReceiver;", "GetConnectivityManagerCallbackObject", "LollipopNetworkRequest", "", "UpdateConnection", "onActive", "onInactive", "app_debug"})
public final class InternetConnection extends androidx.lifecycle.LiveData<java.lang.Boolean> {
    private final android.content.Context PContext = null;
    private android.net.ConnectivityManager ConnectivityManagerObject;
    private android.net.ConnectivityManager.NetworkCallback NetworkCallbackObject;
    private final android.content.BroadcastReceiver NetworkReceiver = null;
    
    public InternetConnection(@org.jetbrains.annotations.NotNull
    android.content.Context PContext) {
        super(null);
    }
    
    @java.lang.Override
    protected void onActive() {
    }
    
    @java.lang.Override
    protected void onInactive() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    private final void LollipopNetworkRequest() {
    }
    
    private final android.net.ConnectivityManager.NetworkCallback GetConnectivityManagerCallbackObject() {
        return null;
    }
    
    private final void UpdateConnection() {
    }
}