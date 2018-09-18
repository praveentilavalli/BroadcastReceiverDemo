package com.example.adityacomputers.broadcastreceiverdemo;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create the intentfilter object for battery changed action
        IntentFilter intentFilter=new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        //create the battery receiver broadcastreceiver object
        BatteryReceiver batteryReceiver=new BatteryReceiver();
        Context context=getApplicationContext();
        //register the broadcastreceiver
        context.registerReceiver(batteryReceiver,intentFilter);
    }
}
