package com.example.customspinner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryAdapter extends BaseAdapter {
    String[] countryArray;
    int flagArray[];

    MainActivity mainActivity;

    CountryAdapter(String[] countryArray, int flagArray[], MainActivity mainActivity){

        this.countryArray=countryArray;
        this.flagArray=flagArray;
        this.mainActivity=mainActivity;
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

        View v= LayoutInflater.from(mainActivity).inflate(R.layout.spinner_country_list,null);
        TextView textView=v.findViewById(R.id.txtCountry);
        ImageView imageView=v.findViewById(R.id.imgFlag);
        textView.setText(countryArray[position]);

        imageView.setImageResource(flagArray[position]);

        return v;
    }
}
