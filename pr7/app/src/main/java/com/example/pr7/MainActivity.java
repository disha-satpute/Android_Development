package com.example.pr7;


import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText enroll, name, email, city;
    private Button button;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enroll = (EditText) findViewById(R.id.enroll);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        city = (EditText) findViewById(R.id.city);
        textView1 = (TextView) findViewById(R.id.textView1);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String enroll1 = enroll.getText().toString();
        String name1 = name.getText().toString();
        String email1 = email.getText().toString();
        String city1 = city.getText().toString();

        if(v.getId()==R.id.button)
        {
            textView1.setText("Roll No.: " + enroll1 + "\nName: " + name1 + "\nEmail: " + email1 + "\nCity: " + city1);
        }
    }
}
