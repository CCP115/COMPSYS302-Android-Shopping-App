package com.compsys.pcpartmart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ItemDetailActivity extends AppCompatActivity {

    private TextView tvItemName;
    private TextView tvItemPrice;
    private TextView tvItemDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Load intent extras
        Intent thisIntent = getIntent();
        Item item = (Item) thisIntent.getSerializableExtra("item");

        // Generate theme appropriately
        if (item.getType().equals("CPU")) {
            setTheme(R.style.cpuList);
        } else if (item.getType().equals("GPU")) {
            setTheme(R.style.gpuList);
        } else {
            setTheme(R.style.mntrList);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        // Link to XML Text Views
        tvItemName = (TextView) findViewById(R.id.tvItemName);
        tvItemPrice = (TextView) findViewById(R.id.tvItemPrice);
        tvItemDesc = (TextView) findViewById(R.id.tvItemDesc);

        // Load the Item passed in by ListActivity
        loadItem(item);

        // Create image slider (ViewPager)
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this, item);
        viewPager.setAdapter(adapter);
    }

    private void loadItem(Item item) {
        // Change activity title
        this.setTitle(item.getName());

        // Set Item Name and Price and Desc
        tvItemName.setText(item.getName());
        tvItemPrice.setText(item.getPrice());
        tvItemDesc.setText(item.getDesc());
    }
}