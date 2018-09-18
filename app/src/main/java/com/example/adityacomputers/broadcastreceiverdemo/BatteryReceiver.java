package com.example.adityacomputers.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

/**
 * Created by ADITYA COMPUTERS on 9/18/2018.
 */

public class BatteryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //get the battery charge level by using the battery intent
        int level=intent.getIntExtra(BatteryManager.EXTRA_LEVEL,-1);
        Toast.makeText(context,"Battery Level Remaning: "+level+"%",Toast.LENGTH_LONG).show();
    }
}
