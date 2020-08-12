package com.example.padhhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OtpVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        Intent intent = getIntent();
        String mob_or_email_value = intent.getStringExtra(MainActivity.MOB_OR_EMAIL_VALUE);
        String otp_number = intent.getStringExtra(MainActivity.OTP_NUMBER);

        TextView textView = (TextView) findViewById(R.id.textViewOtpMessage);
        String text = textView.getText().toString() + " " + mob_or_email_value;
        textView.setText(text);

        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        editText.setText(otp_number);
    }
}