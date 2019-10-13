package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        User user = getIntent().getParcelableExtra("Deta");
        TextView hello = findViewById(R.id.welcome);
        if (user != null) {
            String message = user.getName() + user.getAge();
            hello.setText(message);
        }

    }
}
