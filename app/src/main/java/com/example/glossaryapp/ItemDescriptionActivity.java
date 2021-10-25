package com.example.glossaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_description);

        TextView name = findViewById(R.id.itemName);
        TextView price = findViewById(R.id.itemPrice);
        Intent intent = getIntent();
        Button buy = findViewById(R.id.shopBtn);
        String receivedItems = intent.getStringExtra("itemName");
        if(receivedItems.equals("LapTops")) {
        Laptops samsung = new Laptops("samsung laptop", "spectre", 28000);
        name.setText(samsung.getName());
        price.setText(Integer.toString(samsung.getPrice()));
        }else if(receivedItems.equals("TVS")){
            Tv lg = new Tv("lg 3d tv", 70, 50000);
            name.setText(lg.getName());
            price.setText(Integer.toString(lg.getPrice()));
        }else if(receivedItems.equals("Game Consoles")){
            GameConsole PS4 = new GameConsole("play station 5", 5, 100000);
            name.setText(PS4.getName());
            price.setText(Integer.toString(PS4.getPrice()));
        }else if(receivedItems.equals("HomeTheatres")){
            Speakers sony = new Speakers("sony hometheatre", 4 , 45000);
            name.setText(sony.getName());
             price.setText(Integer.toString(sony.getPrice()));
        }else{
            System.out.println("error");
        }
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String product = name.getText().toString();
                Intent intent = new Intent(ItemDescriptionActivity.this, ShopActivity.class);
                intent.putExtra("product", product);
                startActivity(intent);
            }
        });
    }
}