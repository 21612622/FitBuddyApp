package com.example.fitbuddyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    ImageView sback;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        sback = (ImageView)findViewById(R.id.sback);
        sback.setOnClickListener(new View.OnClickListener() {

            public void onClick(View S)
            {
                Intent it = new Intent(signup.this, MainActivity.class);
                startActivity(it);

            }
        });
    }
}
