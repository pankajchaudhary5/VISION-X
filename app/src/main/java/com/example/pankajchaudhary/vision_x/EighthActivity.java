package com.example.pankajchaudhary.vision_x;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class EighthActivity extends AppCompatActivity {
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        timer =new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent in=new Intent(EighthActivity.this,MainActivity.class);
                startActivity(in);
                finish();

            }
        },2000);
    }
}
