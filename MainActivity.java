package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onBtnClick (View view) {
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        EditText Age = findViewById(R.id.editTextNumber);
        TextView txtHello = findViewById(R.id.txtMessage);
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        TextView txtAge = findViewById(R.id.txtAge);
        TextView txtEmail = findViewById(R.id.txtEmail);
        txtHello.setText("Hello "+edtTxtName.getText().toString());
        txtAge.setText(Age.getText().toString());
        txtEmail.setText(email.getText().toString());

    }
}
