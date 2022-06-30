package com.example.abcdaloteria;



import android.os.Bundle;


public class HomeActivity extends ToolActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        enableFullScreen();
        enableKeepScreenOn();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



    }

}

