package com.adithyarachmat.buxapp.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adithyarachmat.buxapp.R;

public class LoginActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void btnToLogin3(View view) {
        Intent i = new Intent(LoginActivity2.this, LoginActivity3.class);
        startActivity(i);
    }
}