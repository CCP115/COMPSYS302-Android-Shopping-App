package com.compsys.pcpartmart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.TextView;

public class ItemDetailActivity extends AppCompatActivity {

    private TextView tvItemName;
    private TextView tvItemPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        // Link to XML Text Views
        tvItemName = (TextView) findViewById(R.id.tvItemName);
        tvItemPrice = (TextView) findViewById(R.id.tvItemPrice);
        //tvItemDesc = (TextView) findViewById(R.id.tvItemDesc);

        // Load the Item passed in by ListActivity
        Intent thisIntent = getIntent();
        Item item = (Item) thisIntent.getSerializableExtra("item");
        loadItem(item);

        // Create image slider (ViewPager)
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this, item);
        viewPager.setAdapter(adapter);
    }

    private void loadItem(Item item) {
        // Change activity title
        this.setTitle(item.get_name());

        // Set Item Name and Price and Desc
        tvItemName.setText(item.get_name());
        tvItemPrice.setText(item.get_price());
        //tvItemDesc.setText(item.get_desc());
    }
}