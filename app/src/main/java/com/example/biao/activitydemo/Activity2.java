package com.example.biao.activitydemo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by biao on 2018/3/27.
 */

public class Activity2 extends Activity {

    private TextView tv_out;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout2);

        tv_out = findViewById(R.id.tv_out);

        String str = getIntent().getStringExtra("name");
        tv_out.setText(str);

    }
    public void doClick(View view){
        Intent intent = new Intent();
        intent.putExtra("resultname","hello Activity");
        setResult(0,intent);

        finish();
    }
}
