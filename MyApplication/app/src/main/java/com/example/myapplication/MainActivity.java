package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText Email, password;
    Button signin;
    String email = "john@gmail.com";
    String password_1 = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Email = findViewById(R.id.Email);
        password = findViewById(R.id.password);

    }

    public void signin(View view) {
        String email_1 = String.valueOf(Email.getText());
        String userpassword = String.valueOf(password.getText());

        if ((userpassword.equals(password_1)) && (email_1.equals(email))) {
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(i);
        } else {
            Intent i = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(i);
        }

    }
}