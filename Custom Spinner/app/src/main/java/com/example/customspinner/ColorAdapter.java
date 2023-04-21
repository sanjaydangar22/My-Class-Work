package com.example.customspinner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    String[] colorArray;
    MainActivity mainActivity;

    public ColorAdapter(String[] colorArray, MainActivity mainActivity) {
        this.colorArray = colorArray;
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return colorArray.length;
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

        View v = LayoutInflater.from(mainActivity).inflate(R.layout.spinner_color_list, null);
        TextView textView = v.findViewById(R.id.txtColor);
        textView.setText(colorArray[position]);
        return v;
    }
}
