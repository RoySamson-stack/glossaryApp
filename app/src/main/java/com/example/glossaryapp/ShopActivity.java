package com.example.glossaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        Intent intent = getIntent();
        TextView produce = findViewById(R.id.product);
        String product = intent.getStringExtra("product");
        TextView price = findViewById(R.id.price);
        String amount = intent.getStringExtra("price");
        TextView totalAmnt = findViewById(R.id.TotalinKES);
        EditText qnty = findViewById(R.id.quantity);

        produce.setText(product);
        price.setText(amount);

        Button buy = findViewById(R.id.checkout);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String qnt = qnty.getText().toString();

                int intQty = Integer.parseInt(qnt);
                int intPrice = Integer.parseInt(amount);

                int total = intPrice*intQty;
                totalAmnt.setText("total in KES" + total);

            }
        });
    }
}