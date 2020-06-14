package com.compsys.pcpartmart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Recycler View object
    RecyclerView recyclerView;

    // Array list for recycler view data source
    ArrayList<String> source;

    // Layout Manager
    RecyclerView.LayoutManager RecyclerViewLayoutManager;

    // adapter class object
    RecyclerViewAdapter adapter;

    // Linear Layout Manager
    LinearLayoutManager HorizontalLayout;

    View ChildView;
    int RecyclerViewItemPosition;

    View.OnClickListener gpuButtonHandler = new View.OnClickListener() {
        public void onClick(View view) {
            Intent listActivity = new Intent(getBaseContext(), ListActivity.class);
            listActivity.putExtra("MessageFromMainActivity", "GPU");
            startActivity(listActivity);
        }
    };

    View.OnClickListener cpuButtonHandler = new View.OnClickListener() {
        public void onClick(View view) {
            Intent listActivity = new Intent(getBaseContext(), ListActivity.class);
            listActivity.putExtra("MessageFromMainActivity", "CPU");
            startActivity(listActivity);
        }
    };

    View.OnClickListener mntrButtonHandler = new View.OnClickListener() {
        public void onClick(View view) {
            Intent listActivity = new Intent(getBaseContext(), ListActivity.class);
            listActivity.putExtra("MessageFromMainActivity", "MONITOR");
            startActivity(listActivity);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);

        // Set MenuItem and SearchView up in java
        final MenuItem searchItem = menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) searchItem.getActionView();

        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(new ComponentName(this, ListActivity.class)));
        searchView.setQueryHint("Search Items");

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialisation with id's
        recyclerView = (RecyclerView) findViewById(R.id.top_picks_view);
        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());

        // Set LayoutManager on Recycler View
        recyclerView.setLayoutManager(RecyclerViewLayoutManager);

        // Adding items to RecyclerView.
        AddItemsToRecyclerViewArrayList();

        // calling constructor of adapter
        // with source list as a parameter
        adapter = new RecyclerViewAdapter(source);

        // Set Horizontal Layout Manager
        // for Recycler view
        HorizontalLayout = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(HorizontalLayout);

        // Set adapter on recycler view
        recyclerView.setAdapter(adapter);

        // Set up handler for GPU button press
        Button gpuButton = (Button) findViewById(R.id.gpu_button);
        gpuButton.setOnClickListener(gpuButtonHandler);

        // Set up handler for CPU button press
        Button cpuButton = (Button) findViewById(R.id.cpu_button);
        cpuButton.setOnClickListener(cpuButtonHandler);

        // Set up handler for monitor button press
        Button mntrButton = (Button) findViewById(R.id.mntr_button);
        mntrButton.setOnClickListener(mntrButtonHandler);
    }

    // Function to add items in RecyclerView.
    public void AddItemsToRecyclerViewArrayList() {
        // Adding items to ArrayList
        source = new ArrayList<>();
        source.add("1");
        source.add("2");
        source.add("3");
    }
}