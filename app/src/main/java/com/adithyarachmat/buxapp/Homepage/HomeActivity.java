package com.adithyarachmat.buxapp.Homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adithyarachmat.buxapp.Login.LoginActivity2;
import com.adithyarachmat.buxapp.Login.LoginActivity3;
import com.adithyarachmat.buxapp.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void btnToHome2(View view) {
        Intent i = new Intent(HomeActivity.this, HomeActivity2.class);
        startActivity(i);
    }
}