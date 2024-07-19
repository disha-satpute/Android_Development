package com.example.custom_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    public Button b1;
    public String  result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                 result = "Hey user, we show you an example of Custom Toast alert";
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));
                TextView tv = (TextView) layout.findViewById(R.id.txt);
                tv.setText(result.toString());

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 100, 100);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }

        });

        }
    }
