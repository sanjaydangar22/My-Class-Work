package com.example.customspinner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class LanguageAdapter extends BaseAdapter {
    String[] languageArray;
    MainActivity mainActivity;
    public LanguageAdapter(String[] languageArray, MainActivity mainActivity) {
        this.languageArray=languageArray;
        this.mainActivity=mainActivity;
    }

    @Override
    public int getCount() {
        return languageArray.length;
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

        View v= LayoutInflater.from(mainActivity).inflate(R.layout.spinner_language_list,null);
        TextView textView =v.findViewById(R.id.txtLanguage);
        textView.setText(languageArray[position]);

        return v;
    }
}
