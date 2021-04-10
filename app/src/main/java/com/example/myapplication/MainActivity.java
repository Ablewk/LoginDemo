package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    public void open(View v) {
        Intent intent = new Intent(MainActivity.this, RightFragment.class);
        startActivity(intent);//在点击按钮调用该函数之后程序打开RightFrament界面会崩溃,和上个实验一样(换了几种方法始终未能解决)
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.right, new RightFragment());
        transaction.commit();
    }
}

