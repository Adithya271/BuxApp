package com.adithyarachmat.buxapp.Homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adithyarachmat.buxapp.R;

public class HomeActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home4);
    }

    public void imgBackToHome3(View view) {
        Intent i = new Intent(HomeActivity4.this, HomeActivity3.class);
        startActivity(i);
    }

    public void btnToPay(View view) {
        Intent i = new Intent(HomeActivity4.this, PaymentActivity.class);
        startActivity(i);
    }
}