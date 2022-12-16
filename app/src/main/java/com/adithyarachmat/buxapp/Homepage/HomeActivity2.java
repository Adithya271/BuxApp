package com.adithyarachmat.buxapp.Homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adithyarachmat.buxapp.Login.LoginActivity2;
import com.adithyarachmat.buxapp.Login.LoginActivity3;
import com.adithyarachmat.buxapp.R;

public class HomeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
    }

    public void imgBackToHome1(View view) {
        Intent i = new Intent(HomeActivity2.this, HomeActivity.class);
        startActivity(i);
    }

    public void btnToHome3(View view) {
        Intent i = new Intent(HomeActivity2.this, HomeActivity3.class);
        startActivity(i);
    }
}