package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalAdapter extends BaseAdapter {
    ArrayList<Integer>imageArray;
    ArrayList<String>nameArray;
    Context context;
    AnimalAdapter(ArrayList<Integer>imageArray, ArrayList<String>nameArray, Context context){
        this.imageArray=imageArray;
        this.nameArray=nameArray;
        this.context=context;
    }
    @Override
    public int getCount() {
        return imageArray.size();
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
        View v= LayoutInflater.from(context).inflate(R.layout.animal_list,null);
        ImageView imageView =v.findViewById(R.id.imgAnimal);
        TextView textView =v.findViewById(R.id.txtName);

        imageView.setImageResource(imageArray.get(position));
        textView.setText(nameArray.get(position));
        return v;
    }
}
