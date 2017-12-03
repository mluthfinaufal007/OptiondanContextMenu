package com.example.asus.utsapp;

/**
 * Created by ASUS on 13/11/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class menu extends AppCompatActivity {
    Button listor, about, exit;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        listor = (Button) findViewById(R.id.listor);
        about = (Button) findViewById(R.id.about);
        exit = (Button) findViewById(R.id.exit);

        listor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, list_olahraga.class);
                menu.this.startActivity(intent);

            }
        });


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, web.class);
                menu.this.startActivity(intent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }

        });

    }
}