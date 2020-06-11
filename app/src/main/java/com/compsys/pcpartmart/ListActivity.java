package com.compsys.pcpartmart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView lvItems;
    ItemAdapter itemAdapter;
    ArrayList<Item> aItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lvItems = (ListView) findViewById(R.id.lvItems);
        ArrayList<Item> aItems = new ArrayList<Item>();

        aItems = DataProvider.generateData();
        itemAdapter = new ItemAdapter(this, aItems);

        lvItems.setAdapter(itemAdapter);

    }
}