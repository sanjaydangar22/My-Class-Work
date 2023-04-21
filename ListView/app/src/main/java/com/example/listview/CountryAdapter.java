package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryAdapter extends BaseAdapter {
    String countryArray[];
    int flagArray[];
    Context context;
    CountryAdapter(String countryArray[], int flagArray[], Context context)
    {
        this.countryArray=countryArray;
        this.flagArray=flagArray;
        this.context=context;
    }

    @Override
    public int getCount() {
        return countryArray.length;
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
        View v= LayoutInflater.from(context).inflate(R.layout.country_list,null);
        TextView textView =v.findViewById(R.id.txtCountry);
        ImageView imageView=v.findViewById(R.id.imgCountry);

        textView.setText(countryArray[position]);
        imageView.setImageResource(flagArray[position]);
        return v;
    }
}
