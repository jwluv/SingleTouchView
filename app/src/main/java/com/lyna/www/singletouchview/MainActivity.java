package com.lyna.www.singletouchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SingleTouchView singleTouchView = new SingleTouchView(this, null);
        setContentView(singleTouchView);
    }
}
