package com.alamin.dynamicbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangeReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.let {
            val isEnabled = intent.getBooleanExtra("state",false)
            Toast.makeText(context,if (isEnabled) "Airplane Mode Enabled" else " Airplane Mode Disabled" , Toast.LENGTH_SHORT).show()
        }
    }
}