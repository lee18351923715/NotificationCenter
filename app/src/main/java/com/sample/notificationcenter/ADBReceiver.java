package com.sample.notificationcenter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ADBReceiver extends BroadcastReceiver {

    private final String ADB_ACTION = "adb.addmessage";

    @Override
    public void onReceive(Context context, Intent intent) {
       String action = intent.getAction();
        if(Intent.ACTION_SCREEN_OFF.equals(action)){
            Toast.makeText(context,"屏幕关闭了",Toast.LENGTH_SHORT).show();
        }
        else if(Intent.ACTION_SCREEN_ON.equals(action)){
            Toast.makeText(context,"屏幕打开了",Toast.LENGTH_SHORT).show();
        }
    }
}
