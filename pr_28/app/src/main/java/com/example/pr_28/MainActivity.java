package com.example.pr_28;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import
        androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends
        AppCompatActivity {
    private static final String
            CORRECT_USERNAME = "user123";
    private static final String
            CORRECT_PASSWORD = "password123";
    private int unsuccessfulAttempts = 0;
    @Override
    protected void onCreate(Bundle
                                    savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginButton =
                findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginClick(v);
            }
        });
    }
    public void onLoginClick(View view) {
        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        String enteredUsername = usernameEditText.getText().toString();
        String enteredPassword = passwordEditText.getText().toString();
        if (isValidLogin(enteredUsername, enteredPassword)) {
// Successful login
            showToast("Login successful");
            unsuccessfulAttempts = 0; // Reset unsuccessful attempts
        } else {
            showToast("Login unsuccessful");
            unsuccessfulAttempts++;
            if (unsuccessfulAttempts >= 3) {
                showToast("Too many unsuccessful attempts. Account locked.");
            }
        }
    }
    private boolean isValidLogin(String username, String password) {
// Perform your validation logic here
        return username.equals(CORRECT_USERNAME) &&
                password.equals(CORRECT_PASSWORD);
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}