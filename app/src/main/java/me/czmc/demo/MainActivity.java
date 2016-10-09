package me.czmc.demo;

import android.os.Bundle;

import me.czmc.library.activity.TitleActivity;

public class MainActivity extends TitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCustomContentView(R.layout.activity_main,"测试");
    }
}
