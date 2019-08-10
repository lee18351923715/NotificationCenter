package com.sample.notificationcenter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BootCompleted extends BroadcastReceiver {

    public static final String ACTION = "android.intent.action.BOOT_COMPLETED";

    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(ACTION)) {
//            Intent welcomeIntent = new Intent(context, ListenService.class);
//            context.startService(welcomeIntent);
            Toast.makeText(context,"开机了",Toast.LENGTH_SHORT).show();
        }
    }
}
