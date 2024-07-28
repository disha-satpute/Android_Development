package com.example.pra_25_1;


import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button zoomIn, zoomOut, fadeIn, fadeOut, rotateClock, rotateAnti;
    ImageView imageView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zoomIn = (Button)findViewById(R.id.zoomin);
        zoomOut = (Button)findViewById(R.id.zoomout);
        fadeIn = (Button)findViewById(R.id.fade_in);
        fadeOut = (Button)findViewById(R.id.fade_out);
        rotateAnti = (Button)findViewById(R.id.rotateA);
        rotateClock = (Button)findViewById(R.id.rotateC);
        imageView = (ImageView)findViewById(R.id.imageView);
        zoomIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setScaleX(imageView.getScaleX() + (float)0.1);
                imageView.setScaleY(imageView.getScaleY() + (float)0.1);
            }
        });
        zoomOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setScaleX(imageView.getScaleX() - (float)0.1);
                imageView.setScaleY(imageView.getScaleY() - (float)0.1);
            }
        });
        rotateClock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setRotation((float)imageView.getRotation() + 20);
            }
        });
        rotateAnti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setRotation((float)imageView.getRotation() - 20);
            }
        });
        fadeIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Animation aniFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                imageView.startAnimation(aniFadein);
            }
        });
        fadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation aniFadeout = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
                imageView.startAnimation(aniFadeout);
            }
        });
    }
}

