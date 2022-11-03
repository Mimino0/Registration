package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reg extends AppCompatActivity {

    private Button registration;
    private Button toLog;
    private EditText password;
    private EditText passwordRepeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        password = (EditText) findViewById(R.id.passwordReg);
        passwordRepeat = (EditText) findViewById(R.id.passwordRepeatReg);
        toLog = (Button) findViewById(R.id.toLog);
        registration = (Button) findViewById(R.id.registration);
    }

    public void Reg(View view) {

        if (password.getText().toString().equals(passwordRepeat.getText().toString())) {

            Intent intent = new Intent(Reg.this, Index.class);
            startActivity(intent);

        } else {
            Toast.makeText(getApplicationContext(), "Пароли несовпадают",Toast.LENGTH_LONG).show();
        }
    }

    public void ToLog(View view) {
        Intent intent = new Intent(Reg.this, Login.class);
        startActivity(intent);
    }
}