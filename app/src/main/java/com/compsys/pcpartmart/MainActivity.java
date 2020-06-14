package com.compsys.pcpartmart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
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
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> contacts;
    RecyclerViewAdaptor adapter;
    RecyclerView rvContacts;

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

        // Lookup the recyclerview in activity layout
        rvContacts = (RecyclerView) findViewById(R.id.top_picks_view);

        // Initialize contacts
        contacts = DataProvider.generateData();
        // Create adapter passing in the sample user data
        adapter = new RecyclerViewAdaptor(contacts);
        // Attach the adapter to the recyclerview to populate items
        rvContacts.setAdapter(adapter);

        // Fore a Horizontal RecyclerView use
         LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        // Set layout manager to position the items
        rvContacts.setLayoutManager(lm);

        // Set up handler for GPU button press
        CardView gpuButton = (CardView) findViewById(R.id.gpu_button);
        gpuButton.setOnClickListener(gpuButtonHandler);

        // Set up handler for CPU button press
        CardView cpuButton = (CardView) findViewById(R.id.cpu_button);
        cpuButton.setOnClickListener(cpuButtonHandler);

        // Set up handler for monitor button press
        CardView mntrButton = (CardView) findViewById(R.id.mntr_button);
        mntrButton.setOnClickListener(mntrButtonHandler);
    }

}