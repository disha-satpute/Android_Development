package com.example.map;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText etSource,etDestination;
    Button button;
    @Override
    protected void onCreate(Bundle st) {
        super.onCreate(st);
        setContentView(R.layout.activity_main);
        etSource = findViewById(R.id.et_source);
        etDestination = findViewById(R.id.et_destination);
        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Source = etSource.getText().toString().trim();
                String Destination = etDestination.getText().toString().trim();
                if(Source.equals("") && Destination.equals("")){
                    Toast.makeText(MainActivity.this, "Enter both location",
                            Toast.LENGTH_SHORT).show();
                }else{
                    DisplayTrack(Source,Destination); }}}); }
    private void DisplayTrack(String sSource, String sDestination) {
        try{
            Uri uri = Uri.parse("https://www.google.co.in/maps/dir/" + sSource + "/" + sDestination);
            Intent intent= new Intent(Intent.ACTION_VIEW,uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent= new Intent(Intent.ACTION_VIEW,uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }}}