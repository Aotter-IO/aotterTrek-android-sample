package com.aotter.net.treksampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aotter.net.treksampleapp.activity.NativeListViewActivity;
import com.aotter.net.treksampleapp.activity.VideoListViewActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.native_listview)
    public void goNativeList() {
        Intent intent = new Intent();
        intent.setClass(this, NativeListViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.video_listview)
    public void goVideoList() {
        Intent intent = new Intent();
        intent.setClass(this, VideoListViewActivity.class);
        startActivity(intent);
    }
}
