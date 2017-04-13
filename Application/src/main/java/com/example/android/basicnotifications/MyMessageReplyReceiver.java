package com.example.android.basicnotifications;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyMessageReplyReceiver extends BroadcastReceiver {
    private static String LOG_TAG = MyMessageReplyReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        // an Intent broadcast.
        int thisConversationId = intent.getIntExtra("conversation_id", -1);
        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
        if (remoteInput != null) {
            CharSequence replyText = remoteInput.getCharSequence("voice_reply_key");
            Log.d(LOG_TAG, "Found voice reply [ " + replyText + " ] from comversation_id =" + thisConversationId);
        }
    }
}
