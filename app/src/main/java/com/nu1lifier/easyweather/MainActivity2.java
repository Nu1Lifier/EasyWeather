package com.nu1lifier.easyweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements Constants{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);
        TextView cityDubai = findViewById(R.id.dubai);
        Button BackButton = findViewById(R.id.BackButton);

        cityDubai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView cityField = findViewById(R.id.city_field);
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra(TEXT, cityField.getText().toString());
                finish();
            }
        });

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}