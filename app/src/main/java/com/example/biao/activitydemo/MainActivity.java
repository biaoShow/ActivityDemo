package com.example.biao.activitydemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_out;
    //dlkflkajdklf kldfjl d
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_out = findViewById(R.id.tv_out);

    }

    public void doClick(View view){
        Intent intent = new Intent(MainActivity.this,Activity2.class);
        intent.putExtra("name","hello Activity2");
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String str = data.getStringExtra("resultname");
        tv_out.setText(str);
        super.onActivityResult(requestCode, resultCode, data);
    }
}
