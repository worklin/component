package me.czmc.demo;

import android.os.Bundle;

import me.czmc.library.activity.TitleActivity;

public class MainActivity extends TitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setWhiteModel(true);
        setCustomContentView(R.layout.activity_main,"测试");
        showProgress("努力加载中..");
    }
}
