package com.work.lab5_2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony
import android.widget.Toast


class Receiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        for (smsMessage in Telephony.Sms.Intents.getMessagesFromIntent(intent)) {
            val msg = "From " +
                    smsMessage.originatingAddress.toString() +
                    " : " + smsMessage.messageBody
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }
    }
}
