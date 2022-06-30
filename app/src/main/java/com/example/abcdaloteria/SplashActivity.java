package com.example.abcdaloteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;

public class SplashActivity extends ToolActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        enableFullScreen();
        enableKeepScreenOn();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        img = findViewById(R.id.Splash_imageView1);

        AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) img.getDrawable();
        drawable.start();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), HomeActivity.class));
                finish();
            }
        }, 9500);
    }
}