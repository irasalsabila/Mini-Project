package com.ira.projects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void gmaps(View view) {
        String lokasi = "";
        Uri addressUri = Uri.parse("geo:0,0?q=" + lokasi);

        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        startActivity(intent);
    }

    public void netflix(View view) {
        String url = "https://www.netflix.com";
        Uri webpage = Uri.parse(url);
        Log.d("URL", url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void gojek(View view) {
        String url = "https://gojek.onelink.me/2351932542?af_banner=true&pid=Go-Jek_Web&c=WebToAppBanner&af_adset=bottom-banner&af_ad=%2F&af_dp=gojek%3A%2F%2Fhome";
        Uri webpage = Uri.parse(url);
        Log.d("URL", url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void classroom(View view) {
        String url = "https://classroom.google.com/u/0/h";
        Uri webpage = Uri.parse(url);
        Log.d("URL", url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}