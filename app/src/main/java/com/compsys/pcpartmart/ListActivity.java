package com.compsys.pcpartmart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.view.View.GONE;

public class ListActivity extends AppCompatActivity {

    TextView tvSearchQuery;
    TextView tvNoResults;
    ListView lvItems;
    ItemAdapter itemAdapter;
    ArrayList<Item> aItems;

//    View.OnClickListener clickHandler = new View.OnClickListener() {
//        public void onClick(View view) {
//            Intent detailActivity = new Intent(getBaseContext(), ItemDetailActivity.class);
//            detailActivity.putExtra("MessageFromMainActivity", "GPU");
//            startActivity(detailActivity);
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create intent to receive the type of List to display
        Intent intent = getIntent();
        String listToOpen = intent.getStringExtra("MessageFromMainActivity");

        // Need to set theme before content view
        if (listToOpen == null) {
            // If there was no extra then just keep the main theme
            ;
        } else if (listToOpen.equals("GPU")) {
            setTheme(R.style.gpuList);
        } else if (listToOpen.equals("MONITOR")) {
            setTheme(R.style.mntrList);
        } else if (listToOpen.equals("CPU")) {
            setTheme(R.style.cpuList);
        }

        // Set content view
        setContentView(R.layout.activity_list);

        // Create ListView objects to associate with XML views
        lvItems = (ListView) findViewById(R.id.lvItems);
        tvSearchQuery = (TextView) findViewById(R.id.tvSearchQuery);
        tvNoResults = (TextView) findViewById(R.id.tvNoResults);
        ArrayList<Item> aItems = new ArrayList<Item>();

        // First check if there is a search query, otherwise it is a regular list call
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);

            // Set theme and title
            setTheme(R.style.MainTheme);
            setTitle("Search Results");
            tvSearchQuery.setText("Showing Results for \"" + query + "\"");

            // Search for matching items
            aItems = DataProvider.searchAll(query);

        } else if (listToOpen.equals("GPU")) {
            setTheme(R.style.gpuList);
            setTitle("GPU Selection");
            aItems = DataProvider.generateGpuData();

            // Set the search query visibility to gone
            tvSearchQuery.setVisibility(GONE);
            tvNoResults.setVisibility(GONE);

        } else if (listToOpen.equals("MONITOR")) {
            setTheme(R.style.mntrList);
            setTitle("Monitor Selection");
            aItems = DataProvider.generateMntrData();

            // Set the search query visibility to gone
            tvSearchQuery.setVisibility(GONE);
            tvNoResults.setVisibility(GONE);

        } else if (listToOpen.equals("CPU")) {
            setTheme(R.style.cpuList);
            setTitle("CPU Selection");
            aItems = DataProvider.generateCpuData();

            // Set the search query visibility to gone
            tvSearchQuery.setVisibility(GONE);
            tvNoResults.setVisibility(GONE);
        }

        // Set up ItemAdapter with data
        itemAdapter = new ItemAdapter(this, aItems);
        lvItems.setAdapter(itemAdapter);

        // Hide no results textview if aItems is not empty
        if (aItems.size() != 0) {
            tvNoResults.setVisibility(GONE);
        }

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