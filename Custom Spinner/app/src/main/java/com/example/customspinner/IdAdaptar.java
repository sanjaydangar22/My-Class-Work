package com.example.customspinner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class IdAdaptar extends BaseAdapter {

    String[] documentArray;


    MainActivity mainActivity;


    public IdAdaptar(String[] documentArray, MainActivity mainActivity) {

        this.documentArray = documentArray;

        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return documentArray.length;
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

        View v = LayoutInflater.from(mainActivity).inflate(R.layout.spinner_id_list, null);
        TextView textView = v.findViewById(R.id.txtId);
        textView.setText(documentArray[position]);


        return v;
    }
}
