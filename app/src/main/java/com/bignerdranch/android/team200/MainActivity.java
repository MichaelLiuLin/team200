package com.bignerdranch.android.team200;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button) findViewById(R.id.button1);
        mButton1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

//https://drive.google.com/open?id=10K3IPzgOSIP4UQvoCp2oJTm5oPPvFgo1&usp=sharing
//                Uri uri2 = Uri.parse("https://www.google.com");
//                Uri uri = Uri.parse("https://drive.google.com/open?id=10K3IPzgOSIP4UQvoCp2oJTm5oPPvFgo1&usp=sharing"); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);

                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(myIntent);

            }
        });




        mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {



//                ComponentName cn;
//                Intent i = new Intent();
//                cn = new ComponentName("com.android.calendar", "com.android.calendar.LaunchActivity");
//                i.setComponent(cn);
//                startActivity(i);

//                Uri uri = Uri.parse("https://www.sunshinecoast.qld.gov.au/Living-and-Community/Waste-and-Recycling/Bin-collection-days"); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);

                Intent myIntent = new Intent(MainActivity.this, FouthActivity.class);
                startActivity(myIntent);
            }
        });

        mButton3 = (Button) findViewById(R.id.button3);
        mButton3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uri = Uri.parse("https://drive.google.com/open?id=1CAvJvnvFr8SNTEh_dAohELICbz6onMUZ&usp=sharing"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });


    }
}
