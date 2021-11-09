package com.example.foodnowdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtEmail, txtPassword;
    Button btnForgot, btnSignIn, btnSignUp;
    TextView txtFacebook, txtGoogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        btnForgot = findViewById(R.id.btnForgot);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignUp = findViewById(R.id.btnSignUp);
        txtFacebook = findViewById(R.id.txtFacebook);
        txtGoogle = findViewById(R.id.txtGoogle);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(txtEmail.getText()) || txtPassword.getText().toString().equals("")) {
                    Toast.makeText(SignInActivity.this, "you have to enter your name and password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

//        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnForgot: break;
            case R.id.btnSignIn: break;
            case R.id.btnSignUp: break;
            case R.id.txtFacebook: break;
            case R.id.txtGoogle: break;

        }
    }
}