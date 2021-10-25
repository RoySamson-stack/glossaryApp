package com.example.glossaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button login = findViewById(R.id.login);
        TextView linkSign = findViewById(R.id.linkSign);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ItemsActivity.class);
                startActivity(intent);
            }
        });
        linkSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linkSign = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(linkSign);
            }
        });
    }
}