package com.example.asus.utsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView browser = (WebView) findViewById(R.id.about);
        browser.loadData("" +
                "<html>" +
                " <body>" +
                " <title>About Aplikasi </title>" +
                "<p>" +
                "<p>" +
                "Aplikasi ini aplikasi pencatatan waktu olahraga." +
                "<p>" +
                "Aplikasi ini dibuat oleh : <br/>" +
                "(1406039) - Dwiki Muhammad Rifki Diti <br/>" +
                "(1406083) - Muhammad Luthfi Naufal <br/>" +
                "Teknik Informatika C 2014<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");
    }
}