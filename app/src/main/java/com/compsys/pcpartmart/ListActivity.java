package com.compsys.pcpartmart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
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

        Intent intent = getIntent();

        String listToOpen = intent.getStringExtra("MessageFromMainActivity");

        if (listToOpen.equals("CPU")) {
            aItems = DataProvider.generateCpuData();
        } else if (listToOpen.equals("GPU")) {
            aItems = DataProvider.generateGpuData();
        } else {
            aItems = DataProvider.generateMntrData();
        }
        itemAdapter = new ItemAdapter(this, aItems);

        lvItems.setAdapter(itemAdapter);

        LinearLayoutManager lm = new LinearLayoutManager(this);
    }
}