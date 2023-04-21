package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ContactsListViewActivity extends AppCompatActivity {

    ListView listContacts;

    String nameArray[]={"vijay","Raj","Ram","Ravan","Hanuman","Laxman","Bharat","Shatrughan","Sita","Urmila","Luv","Kush","Vali","Shugrive"};
    String contactsArray[]={"78995622","859933212","15512004","78951122","95323222222","459812100","52200555222","568589563","45522222278","788953327999","8898889999","8898921212","87989893322","9888888888"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_list_view);

        view();
    }

    private void view() {
        listContacts=findViewById(R.id.listContacts);

        ContactsAdapter contactsAdapter =new ContactsAdapter(nameArray,contactsArray,this);
        listContacts.setAdapter(contactsAdapter);
    }
}