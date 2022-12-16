package com.adithyarachmat.buxapp.Homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adithyarachmat.buxapp.R;

public class HomeActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home3);
    }

    public void imgBackToHome2(View view) {
        Intent i = new Intent(HomeActivity3.this, HomeActivity2.class);
        startActivity(i);
    }

    public void btnToHome4(View view) {
        Intent i = new Intent(HomeActivity3.this, HomeActivity4.class);
        startActivity(i);
    }
}