package com.compsys.pcpartmart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView lvItems;
    ItemAdapter itemAdapter;
    ArrayList<Item> aItems;

    View.OnClickListener clickHandler = new View.OnClickListener() {
        public void onClick(View view) {
            Intent detailActivity = new Intent(getBaseContext(), ItemDetailActivity.class);
            detailActivity.putExtra("MessageFromMainActivity", "GPU");
            startActivity(detailActivity);
        }
    };

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

        setupItemSelectedListener();
    }

    public void setupItemSelectedListener() {
        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), ItemDetailActivity.class);
                intent.putExtra("item", itemAdapter.getItem(position));
                startActivity(intent);
            }
        });
    }
}