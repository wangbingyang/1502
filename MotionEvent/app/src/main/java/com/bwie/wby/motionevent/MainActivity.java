package com.bwie.wby.motionevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity ";
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.MotionEvent);
        mButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN://按下
                        Log.e(TAG, "---onTouchEvent action:ACTION_DOWN" + "----------按下");
                        break;
                    case MotionEvent.ACTION_MOVE://移动
                        Log.e(TAG, "---onTouchEvent action:ACTION_MOVE" + "----------移动");
                        break;
                    case MotionEvent.ACTION_UP://抬起
                        Log.e(TAG, "---onTouchEvent action:ACTION_UP" + "----------抬起");
                        break;
                    case MotionEvent.ACTION_CANCEL://取消
                        Log.e(TAG, "---onTouchEvent action:ACTION_CANCEL" + "----------取消");
                        break;
                    case MotionEvent.ACTION_OUTSIDE://超出边界
                        Log.e(TAG, "---onTouchEvent action:ACTION_OUTSIDE" + "----------超出边界");
                        break;
                    case MotionEvent.ACTION_POINTER_DOWN://多点触摸
                        Log.e(TAG, "---onTouchEvent action:ACTION_POINTER_DOWN" + "----------多点触摸");
                        break;
                    case MotionEvent.ACTION_POINTER_UP://多点离开
                        Log.e(TAG, "---onTouchEvent action:ACTION_POINTER_UP" + "----------多点离开");
                        break;
                }
                return false;
            }
        });
    }


}