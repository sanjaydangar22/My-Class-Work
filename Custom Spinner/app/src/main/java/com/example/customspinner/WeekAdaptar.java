package com.example.customspinner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class WeekAdaptar extends BaseAdapter {
    String[] weekArray;
    MainActivity mainActivity;
    public WeekAdaptar(String[] weekArray, MainActivity mainActivity) {
        this.weekArray=weekArray;
        this.mainActivity=mainActivity;
    }

    @Override
    public int getCount() {
        return weekArray.length;
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

        View v= LayoutInflater.from(mainActivity).inflate(R.layout.spinner_week_list,null);
        TextView textView =v.findViewById(R.id.txtWeek);
        textView.setText(weekArray[position]);
        return v;
    }
}
