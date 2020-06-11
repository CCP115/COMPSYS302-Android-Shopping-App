package com.compsys.pcpartmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
}