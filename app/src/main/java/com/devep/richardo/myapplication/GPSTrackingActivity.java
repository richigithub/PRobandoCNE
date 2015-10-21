package com.devep.richardo.myapplication;

import android.content.Intent;
import android.location.LocationListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GPSTrackingActivity extends AppCompatActivity {

    Button btnShowLocation;


    //GPSTracker class
    GPSTracker gps;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpstracking);

        btnShowLocation = (Button) findViewById(R.id.btnShowLocation);





        //show location
        btnShowLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //create class object
                gps = new GPSTracker(GPSTrackingActivity.this);

                //Check if gps enabled
                if (gps.canGetLocation()) {
                    double latitude = gps.getLatitud();
                    double longitude = gps.getLongitude();

                    // \n is for new line

                    Toast.makeText(getApplicationContext(), "Tu posición es - Lat: " + latitude + " - Long: " + longitude, Toast.LENGTH_SHORT).show();
                } else {
                    //can´t get location
                    //GPS or Network is not enabled
                    //Ask user to enabled GPS/network in settings
                    gps.showSettingsAlert();

                }
            }
        });
    }


    }



