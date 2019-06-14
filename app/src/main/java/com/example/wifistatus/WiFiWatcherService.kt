package com.example.wifistatus

import android.app.IntentService
import android.content.Context
import android.content.Intent
import android.net.wifi.WifiManager

class WiFiWatcherService : IntentService("WiFiWatcherService") {
    override fun onHandleIntent(p0: Intent?) {
        while (true) {
            val wifiManager: WifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
            if (!wifiManager.isWifiEnabled) {
                TODO("Send Notification")
            }
        }
    }
}