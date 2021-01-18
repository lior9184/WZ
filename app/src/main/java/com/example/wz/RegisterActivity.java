package com.example.wz;

import  androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import static com.example.wz.R.id.snackbar_action;
import static com.example.wz.R.id.test_checkbox_android_button_tint;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btns;
    private EditText username, password, confirmation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btns=findViewById(R.id.btn4plus);
        btns.setOnClickListener(this);
        username=findViewById(R.id.edit_textusername);
        password=findViewById(R.id.edit_textpassword);
        confirmation=findViewById(R.id.edit_textconfirmation);




    }

    @Override
    public void onClick(View v) {
        if (v == btns) {
            String user = username.getText().toString();
            String pass = password.getText().toString();
            String conf = confirmation.getText().toString();

            if (!pass.equals(conf))
            {
                Snackbar.make(findViewById(android.R.id.content),"אימות סיסמא/סיסמא שגוי",Snackbar.LENGTH_SHORT).show();
                password.setText("");
                confirmation.setText("");
            }
            else
            {

            }
        }



    }
}