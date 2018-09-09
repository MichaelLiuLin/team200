package com.bignerdranch.android.team200;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private Button mButton2_1;
    private Button mButton2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mButton2_1 = (Button) findViewById(R.id.button2_1);
        mButton2_1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

//https://drive.google.com/open?id=10K3IPzgOSIP4UQvoCp2oJTm5oPPvFgo1&usp=sharing
                Uri uri2 = Uri.parse("https://www.google.com");
                Uri uri = Uri.parse("https://drive.google.com/open?id=10K3IPzgOSIP4UQvoCp2oJTm5oPPvFgo1&usp=sharing"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        mButton2_2 = (Button) findViewById(R.id.button2_2);
        mButton2_2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(myIntent);
            }
        });

    }
}
