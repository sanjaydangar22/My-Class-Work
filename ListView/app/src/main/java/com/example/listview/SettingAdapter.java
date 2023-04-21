package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingAdapter extends BaseAdapter {
    String settingArray[];
    int iconArray[];

    Context context;

    SettingAdapter(String settingArray[], int iconArray[], Context context) {
        this.settingArray = settingArray;
        this.iconArray = iconArray;
       this. context=context;
    }

    @Override
    public int getCount() {
        return settingArray.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v= LayoutInflater.from(context).inflate(R.layout.setting_list,null);
        TextView textView =v.findViewById(R.id.txtName);
        ImageView imageView =v.findViewById(R.id.image);
        textView.setText(settingArray[position]);
        imageView.setImageResource(iconArray[position]);
        return v;
    }
}
