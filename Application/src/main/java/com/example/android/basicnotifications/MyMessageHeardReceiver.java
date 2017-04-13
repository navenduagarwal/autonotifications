package com.example.android.basicnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyMessageHeardReceiver extends BroadcastReceiver {

    private static String LOG_TAG = MyMessageHeardReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        // an Intent broadcast.

        int thisConversationId = intent.getIntExtra("conversation_id", -1);

        Log.d(LOG_TAG, LOG_TAG + "for conversation_id= " + thisConversationId);

    }
}
