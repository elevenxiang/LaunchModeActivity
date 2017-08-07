package com.htc.eleven.launchmodeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TextView tv = (TextView) findViewById(R.id.text_view);

        tv.setText(String.format("Current Task ID: %d\n, Activity info: %s ! ", getTaskId(), toString()));

        findViewById(R.id.btnStartMainActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubActivity.this, MainActivity.class));
            }
        });

        findViewById(R.id.btnStartSubActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubActivity.this, SubActivity.class));
            }
        });
    }
}
