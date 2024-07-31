package com.example.pr_27;


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
    private EditText editTextUsername,
            editTextPassword; private Button buttonLogin;
    @Override
    protected void onCreate(Bundle
                                    savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUsername =
                findViewById(R.id.editTextUsername);
        editTextPassword =
                findViewById(R.id.editTextPassword);
        buttonLogin =
                findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {
            String username = editTextUsername.getText().toString();
            String password = editTextPassword.getText().toString();
            // Check credentials (example: hardcodedcredentials)
            if (username.equals("gpa") &&
                    password.equals("12345")) {
                showToast("Login Successful. Welcome, " +
                        username + "!");
            } else {
                showToast("Login Failed. Invalid username or password.");
            }
        }
        });
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}