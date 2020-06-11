package com.compsys.pcpartmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener gayButtonHandler = new View.OnClickListener() {
        public void onClick(View view) {
            Intent listActivity = new Intent(getBaseContext(), ListActivity.class);
            listActivity.putExtra("MessageFromMainActivity", "This message was sent" +
                    "from the main activity!");
            startActivity(listActivity);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gayButton = (Button) findViewById(R.id.gay_button);
        gayButton.setOnClickListener(gayButtonHandler);
    }
}