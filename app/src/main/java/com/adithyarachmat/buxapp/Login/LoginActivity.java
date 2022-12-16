package com.adithyarachmat.buxapp.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adithyarachmat.buxapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void TxtSignUp(View view) {
        Intent i = new Intent(LoginActivity.this, LoginActivity2.class);
        startActivity(i);
    }
}