package com.example.ibarreta_androidui_xml;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = findViewById(R.id.button);

        btnLogin.setOnClickListener(v -> {
            Toast toast = Toast.makeText(this, "Na minimize na", Toast.LENGTH_SHORT);
            toast.show();
        });
    }
}