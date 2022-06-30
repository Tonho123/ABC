package com.example.abcdaloteria;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ToolActivity extends Activity {

    public enum EngOrientation {
        LANDSCAPE,
        PORTRAIT
    }

    public void setOrientation(EngOrientation orientation) {
        switch(orientation){
            case LANDSCAPE:
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                break;
            case PORTRAIT:
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                break;
        }
    }
    public void enableFullScreen() {
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        window.requestFeature(Window.FEATURE_NO_TITLE);

        if(android.os.Build.VERSION.SDK_INT >-19)
        {
            window.getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            );
        }

    }
    public void enableKeepScreenOn() {
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }


}
