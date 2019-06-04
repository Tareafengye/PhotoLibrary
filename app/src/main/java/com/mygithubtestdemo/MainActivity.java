package com.mygithubtestdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MeiUtilPhotoUtil.onMeizi(this, "http://img.mp.itc.cn/upload/20170309/34b9b75d9fa9406a808c694845fb261d_th.jpg");
        list=new ArrayList<>();
        list.add("http://img.mp.itc.cn/upload/20170309/34b9b75d9fa9406a808c694845fb261d_th.jpg");
        list.add("http://img.mp.itc.cn/upload/20170309/34b9b75d9fa9406a808c694845fb261d_th.jpg");
        list.add("http://img.mp.itc.cn/upload/20170309/34b9b75d9fa9406a808c694845fb261d_th.jpg");
        list.add("http://img.mp.itc.cn/upload/20170309/34b9b75d9fa9406a808c694845fb261d_th.jpg");
        list.add("http://img.mp.itc.cn/upload/20170309/34b9b75d9fa9406a808c694845fb261d_th.jpg");
        MeiUtilPhotoUtil.setNetWorkBigPicture(this, list,0);
    }
}
