package com.example.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CityAdaptar extends BaseAdapter {

    String cityArray[];
Context context;

CityAdaptar(String[] cityArr, Context context){
    this.cityArray=cityArr;
    this.context=context;

}
    @Override
    public int getCount() {
        return cityArray.length;
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

    View v= LayoutInflater.from(context).inflate(R.layout.spinner_city_list,null);
        TextView txtview=v.findViewById(R.id.txtCity);
        txtview.setText(cityArray[position]);
        return v;
    }
}
