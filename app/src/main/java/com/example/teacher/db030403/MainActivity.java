package com.example.teacher.db030403;

import android.location.Address;
import android.location.Geocoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        double lat = 25.0077;
        double lng = 121.5244;
        Geocoder gc = new Geocoder(this, Locale.TRADITIONAL_CHINESE);
        List<Address> lstAddress = null;
        try {
            lstAddress = gc.getFromLocation(lat, lng, 1);
            String returnAddress=lstAddress.get(0).getAddressLine(0);
            Log.d("LOC1", returnAddress);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
