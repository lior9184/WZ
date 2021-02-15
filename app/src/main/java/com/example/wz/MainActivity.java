package com.example.wz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import static com.example.wz.R.id.snackbar_action;
import static com.example.wz.R.id.test_checkbox_android_button_tint;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnup, btnin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnup=findViewById(R.id.signup);
        btnup.setOnClickListener(this);
        btnin=findViewById(R.id.signin);
        btnin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnin)
        {
            Intent intent=new Intent(this,LoginActivity.class);
            startActivity(intent);
        }

            if (v == btnup)
            {
                Intent intent=new Intent(this,RegisterActivity.class);
                startActivity(intent);
            }


    }
}