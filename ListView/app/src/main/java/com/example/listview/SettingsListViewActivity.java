package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class SettingsListViewActivity extends AppCompatActivity {

    ListView listSetting;

    String settingArray[]={"Wifi","Mobile network","Personal Hotspot","Bluetooth","OTG", "Do not disturb",
            "Sound and vibration","Display and Brightness","System update","Fingerprint, face and password","Security & Privacy", "Battery"};
int iconArray[]={R.drawable.wifi,R.drawable.network,R.drawable.hotspot,R.drawable.bluetooth,R.drawable.otg,R.drawable.do_not_disturb,
        R.drawable.sound,R.drawable.brightness,R.drawable.update,R.drawable.fingerprint,R.drawable.security,R.drawable.battery};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_list_view);

        view();
    }

    private void view() {
        listSetting=findViewById(R.id.listSetting);
        SettingAdapter settingAdapter =new SettingAdapter(settingArray,iconArray,this);
        listSetting.setAdapter(settingAdapter);
    }
}