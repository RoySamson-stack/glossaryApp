package com.example.glossaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        LinearLayout tvs = findViewById(R.id.TVS);
        LinearLayout homeTheatre = findViewById(R.id.HomeThearte);
        LinearLayout gameconsole = findViewById(R.id.gameConsole);
        LinearLayout laptops = findViewById(R.id.laptop);


        tvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsActivity.this, ItemDescriptionActivity.class);
                startActivity(intent);
            }
        });
        homeTheatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsActivity.this, ItemDescriptionActivity.class);
                startActivity(intent);
            }
        });
        gameconsole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsActivity.this, ItemDescriptionActivity.class);
                startActivity(intent);
            }
        });
        laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsActivity.this, ItemDescriptionActivity.class);
                startActivity(intent);
            }
        });

    }
}