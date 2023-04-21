package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CityAdapter extends BaseAdapter {
    String listArray[];
    Context context;

    CityAdapter(String[] cityArray, Context context) {
        listArray = cityArray;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listArray.length;
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

        View v = LayoutInflater.from(context).inflate(R.layout.city_list,null);
        TextView textView =v.findViewById(R.id.txtCity);
        textView.setText(listArray[position]);
        return v;
    }
}
