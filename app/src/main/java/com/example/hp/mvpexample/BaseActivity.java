package com.example.hp.mvpexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void showToast(String msg, int duration){
        Toast.makeText(this, msg, duration).show();
    }

    protected void showProgress(){
        // TODO: 1/19/2019 implement custom progress
    }

    protected void hideProgress(){
        // TODO: 1/19/2019 implement hide progress dialog
    }

}
