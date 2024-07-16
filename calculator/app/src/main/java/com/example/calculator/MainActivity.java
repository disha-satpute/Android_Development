package com.example.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText fname, sname, ans;
    private Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname =findViewById(R.id.fname);
        sname=   findViewById(R.id.sname);
        ans = (EditText) findViewById(R.id.ans);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int f1 = fname.getText();
        int s1 = sname.getText();
        if(v.getId()==R.id.button)
        {
            ans.setText("Addition = " + (f1+s1));
        }
    }
}