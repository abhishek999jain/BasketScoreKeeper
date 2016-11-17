package com.chippy.letsandroid.basketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle extra = getIntent().getExtras();
        String str = extra.getString("key");
        TextView  displayResult= (TextView) findViewById(R.id.textView4);
        displayResult.setText(String.valueOf(str));
    }
}
