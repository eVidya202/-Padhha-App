package com.example.padhhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String MOB_OR_EMAIL_VALUE = "com.example.padhhaap.MOB_OR_EMAIL_VALUE";
    public static final String OTP_NUMBER = "com.example.padhhaap.OTP_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Sends OTP to mobile no or email id
    public void sendOTP(View view) {
        Intent intent = new Intent(this, OtpVerificationActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String mob_or_email_value = editText.getText().toString();

        //Call otp client from server here
        // int otp_number = 123456;
        String otp_number = "123456";
        intent.putExtra(MOB_OR_EMAIL_VALUE, mob_or_email_value);
        intent.putExtra(OTP_NUMBER, otp_number);

        startActivity(intent);
    }
}