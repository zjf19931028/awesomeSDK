package com.awesomesdk.base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.awesomesdk.R;
import com.awesomesdk.util.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtils.showToast(MainActivity.this,"123");
    }
}