package com.bignerdranch.android.team200;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FouthActivity extends AppCompatActivity {
    private Button mButton4_1;
    private Button mButton4_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fouth);

        mButton4_1 = (Button) findViewById(R.id.button4_1);
        mButton4_1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

//https://drive.google.com/open?id=10K3IPzgOSIP4UQvoCp2oJTm5oPPvFgo1&usp=sharing
                Uri uri = Uri.parse("https://www.sunshinecoast.qld.gov.au/Living-and-Community/Waste-and-Recycling/Bin-collection-days"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        mButton4_2 = (Button) findViewById(R.id.button4_2);
        mButton4_2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://calendar.google.com/calendar/r"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}