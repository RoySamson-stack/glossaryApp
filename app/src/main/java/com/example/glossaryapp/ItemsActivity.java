package com.example.glossaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        LinearLayout tvs = findViewById(R.id.TVS);
        LinearLayout homeTheatre = findViewById(R.id.HomeThearte);
        LinearLayout gameconsole = findViewById(R.id.gameConsole);
        LinearLayout laptops = findViewById(R.id.laptop);
        TextView itemName1 = findViewById(R.id.textView1);
        TextView itemName2 = findViewById(R.id.textView4);
        TextView itemName3 = findViewById(R.id.textView7);
        TextView itemName4 = findViewById(R.id.textView8);


        tvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemName = itemName3.getText().toString();
                Intent intent = new Intent(ItemsActivity.this, ItemDescriptionActivity.class);
                intent.putExtra("itemName", itemName);
                startActivity(intent);
            }
        });
        homeTheatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemName = itemName2.getText().toString();
                Intent intent = new Intent(ItemsActivity.this, ItemDescriptionActivity.class);
                intent.putExtra("itemName", itemName);
                startActivity(intent);

            }
        });
        gameconsole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemName = itemName4.getText().toString();
                Intent intent = new Intent(ItemsActivity.this, ItemDescriptionActivity.class);
                intent.putExtra("itemName", itemName);
                startActivity(intent);
            }
        });
        laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemName = itemName1.getText().toString();
                Intent intent = new Intent(ItemsActivity.this, ItemDescriptionActivity.class);
                intent.putExtra("itemName", itemName);
                startActivity(intent);
            }
        });

    }
}