package com.adithyarachmat.buxapp.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adithyarachmat.buxapp.Homepage.HomeActivity;
import com.adithyarachmat.buxapp.R;

public class LoginActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);
    }

    public void imgBackToLogin2(View view) {
        Intent i = new Intent(LoginActivity3.this, LoginActivity2.class);
        startActivity(i);
    }

    public void btnToHomeActivity(View view) {
        Intent i = new Intent(LoginActivity3.this, HomeActivity.class);
        startActivity(i);
    }
}