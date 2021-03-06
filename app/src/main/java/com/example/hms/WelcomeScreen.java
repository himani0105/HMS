package com.example.hms;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeScreen extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_welcome);
        imageView = (ImageView) findViewById(R.id.i1);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        imageView.startAnimation(animation);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(WelcomeScreen.this, MainActivity.class));
                    finish();
                }
            }
        };
        timer.start();
    }

}
