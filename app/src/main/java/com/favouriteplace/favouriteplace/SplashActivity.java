package com.favouriteplace.favouriteplace;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    int splashTimeOut=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionbar=getSupportActionBar();
        actionbar.hide(); //for hide actionbar

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent intent=new Intent (SplashActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }

        },splashTimeOut);
    }
}

