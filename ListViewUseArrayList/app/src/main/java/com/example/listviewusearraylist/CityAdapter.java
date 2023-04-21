package com.example.listviewusearraylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAdapter extends BaseAdapter {
    ArrayList<String> cityArray;
    Context context;

    CityAdapter(ArrayList<String> cityArray, Context context) {
        this.cityArray=cityArray;
        this.context = context;
    }

    @Override
    public int getCount() {
        return cityArray.size();
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

        View v= LayoutInflater.from(context).inflate(R.layout.city_list,null);
        TextView textView =v.findViewById(R.id.txtCity);
        textView.setText(cityArray.get(position));
        return v;
    }
}
