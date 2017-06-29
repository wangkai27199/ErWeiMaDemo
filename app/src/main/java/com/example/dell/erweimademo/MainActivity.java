package com.example.dell.erweimademo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.erweimademo.zxing.ZXingActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, ""+getKey(1), Toast.LENGTH_SHORT).show();
        Log.e("zzzzzz",getKey(1)+"");
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(getKey(1));
        
        findViewById(R.id.btn_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ZXingActivity.class);
                startActivity(intent);
            }
        });
    }

    static {
        System.loadLibrary("str");
    }

    public native String getKey(int type);
}
