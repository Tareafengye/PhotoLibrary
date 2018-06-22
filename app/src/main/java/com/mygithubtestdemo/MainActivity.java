package com.mygithubtestdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MeiUtilPhotoUtil.onMeizi(this, "http://img.mp.itc.cn/upload/20170309/34b9b75d9fa9406a808c694845fb261d_th.jpg");
    }
}
