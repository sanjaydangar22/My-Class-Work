package com.example.listviewusearraylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListAdapter extends BaseAdapter {

    ArrayList<String>arrayList;
    ArrayList<Integer>imageList;
    Context context;
    ArrayListAdapter(ArrayList<String>arrayList,ArrayList<Integer>imageList ,Context context){
        this.arrayList=arrayList;
       this. context=context;
       this. imageList=imageList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
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

        View v= LayoutInflater.from(context).inflate(R.layout.array_list,null);
        TextView textView =v.findViewById(R.id.txtView);
        ImageView imageView =v.findViewById(R.id.imgae);
        textView.setText(arrayList.get(position));
        imageView.setImageResource(imageList.get(position));
        return v;
    }
}
