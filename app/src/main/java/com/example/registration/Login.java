package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button login;
    private Button toReg;
    private EditText password;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.nameLog);
        password = (EditText) findViewById(R.id.passwordLog);
        login = (Button) findViewById(R.id.login);
        toReg = (Button) findViewById(R.id.toReg);
    }

    public void login(View view) {

        if (email.getText().toString().equals("admin@mail.ru") &&
        password.getText().toString().equals("admin")) {

            Intent intent = new Intent(Login.this, Index.class);
            startActivity(intent);

        } else {
            Toast.makeText(getApplicationContext(), "Неправильные данные, попробуйте еще раз",Toast.LENGTH_LONG).show();
        }
    }

    public void ToReg(View view) {
        Intent intent = new Intent(Login.this, Reg.class);
        startActivity(intent);
    }
}