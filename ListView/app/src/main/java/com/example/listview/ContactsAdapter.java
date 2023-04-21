package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ContactsAdapter extends BaseAdapter {

    String nameArray[];
    String contactsArray[];

    Context context;
    ContactsAdapter(String nameArray[], String contactsArray[], Context context){
        this.nameArray=nameArray;
        this.contactsArray=contactsArray;
        this.context=context;

    }
    @Override
    public int getCount() {
        return nameArray.length;
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
        View v= LayoutInflater.from(context).inflate(R.layout.contacts_list,null);
        TextView name=v.findViewById(R.id.txtName);
        TextView contacts=v.findViewById(R.id.txtContacts);
        name.setText(nameArray[position]);
        contacts.setText(contactsArray[position]);
        return v;
    }
}
