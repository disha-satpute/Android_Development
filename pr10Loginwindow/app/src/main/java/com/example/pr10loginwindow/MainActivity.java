package com.example.pr10loginwindow;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text1, text2;
    Button btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        btn = findViewById(R.id.btn1);
        result = findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = text1.getText().toString();
                String num2 = text2.getText().toString();
                if(num1.equals("GPA") && num2.equals("1051"))
                {
                result.setText("Login Successfully");
                }
                else {
                    result.setText("Login Failed!!");
                }
            }
        });
    }
}