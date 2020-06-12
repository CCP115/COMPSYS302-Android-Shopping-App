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

        // Create intent to receive the type of List to display
        Intent intent = getIntent();
        String listToOpen = intent.getStringExtra("MessageFromMainActivity");

        // Set theme for which List
        if (listToOpen.equals("CPU")) {
            setTheme(R.style.cpuList);
        } else if (listToOpen.equals("GPU")) {
            setTheme(R.style.gpuList);
        } else {
            setTheme(R.style.mntrList);
        }

        setContentView(R.layout.activity_list);

        // Create ListView object to associate with XML view
        lvItems = (ListView) findViewById(R.id.lvItems);
        ArrayList<Item> aItems = new ArrayList<Item>();

        // Generate the appropriate data for type of ListView called
        if (listToOpen.equals("CPU")) {
            aItems = DataProvider.generateCpuData();
        } else if (listToOpen.equals("GPU")) {
            aItems = DataProvider.generateGpuData();
        } else {
            aItems = DataProvider.generateMntrData();
        }

        // Set up ItemAdapter with data
        itemAdapter = new ItemAdapter(this, aItems);
        lvItems.setAdapter(itemAdapter);

        LinearLayoutManager lm = new LinearLayoutManager(this);

        // Set up OnClickListener for when item is pressed
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