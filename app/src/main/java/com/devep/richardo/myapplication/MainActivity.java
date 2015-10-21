package com.devep.richardo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

Button btnlogin;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin=(Button)findViewById(R.id.btnLoginLink);


        btnlogin.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }

        });
    }

    public void onClick(View v){

                Intent g = new Intent(this, GPSTrackingActivity.class);
                startActivity(g);

        }


    }





