package com.example.asus.utsapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class bulutangkis extends Activity implements View.OnClickListener {
    Button plus, minus, lakukan;
    EditText score;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulutangkis);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        lakukan = (Button) findViewById(R.id.lakukan);
        score = (EditText) findViewById(R.id.editText2);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        lakukan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == plus) {
            counter++;
            score.setText(Integer.toString(counter));
        } else if (view == minus) {
            counter--;
            score.setText(Integer.toString(counter));
        } else if (view == lakukan) {
            Toast.makeText(getApplicationContext(), "Anda akan melakukan" + "\n" + "Olahraga Bulutangkis dengan" + "\n" + "waktu" + "\t" + score.getText().toString() + "\t" + "jam", Toast.LENGTH_LONG).show();
        }
    }
    }
