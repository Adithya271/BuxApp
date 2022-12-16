package com.adithyarachmat.buxapp.Homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.adithyarachmat.buxapp.R;
import com.google.android.material.snackbar.Snackbar;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    public void TxtBRI(View view) {
        Toast.makeText(PaymentActivity.this, "Payment Succeded!", Toast.LENGTH_SHORT).show();
        Toast.makeText(PaymentActivity.this, "Please Give Us Rate..", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=com.example.android"));
        startActivity(intent);
    }

    public void TxtBCA(View view) {
        Toast.makeText(PaymentActivity.this, "Payment Succeded!", Toast.LENGTH_SHORT).show();
        Toast.makeText(PaymentActivity.this, "Please Give Us Rate..", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=com.example.android"));
        startActivity(intent);
    }

    public void TxtVISA(View view) {
        Toast.makeText(PaymentActivity.this, "Payment Succeded!", Toast.LENGTH_SHORT).show();
        Toast.makeText(PaymentActivity.this, "Please Give Us Rate..", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=com.example.android"));
        startActivity(intent);
    }


    public void imgBackToHome4(View view) {
        Intent i = new Intent(PaymentActivity.this, HomeActivity4.class);
        startActivity(i);
    }
}