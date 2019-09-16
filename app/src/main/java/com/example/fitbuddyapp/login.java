package com.example.fitbuddyapp;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    ImageView sback;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sback = (ImageView)findViewById(R.id.sinb);
        sback.setOnClickListener(new View.OnClickListener() {

            public void onClick(View S) {
                Intent it = new Intent(login.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}
