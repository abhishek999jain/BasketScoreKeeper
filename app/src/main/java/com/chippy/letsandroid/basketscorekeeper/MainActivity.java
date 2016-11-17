package com.chippy.letsandroid.basketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add3_A;
    Button add2_A;
    Button add1_A;
    Button add3_B;
    Button add2_B;
    Button add1_B;
    Button result;
    Button resetButton;
    public int scoreOfTeamA = 0;
    public int scoreOfTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add3_A=(Button)findViewById(R.id.button1);
        add3_A.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                scoreOfTeamA += 3;
                updateTeamAScore();
            }
        });

        add2_A=(Button)findViewById(R.id.button2);
        add2_A.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                scoreOfTeamA += 2;
                updateTeamAScore();
            }
        });
        add1_A=(Button)findViewById(R.id.button3);
        add1_A.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                scoreOfTeamA += 1 ;
                updateTeamAScore();
            }
        });
        add3_B=(Button)findViewById(R.id.button4);
        add3_B.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                scoreOfTeamB += 3;
                updateTeamBScore();
            }
        });
        add2_B=(Button)findViewById(R.id.button5);
        add2_B.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                scoreOfTeamB += 2;
                updateTeamBScore();
            }
        });
        add1_B=(Button)findViewById(R.id.button6);
        add1_B.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                scoreOfTeamB += 1;
                updateTeamBScore();
            }
        });
        result=(Button)findViewById(R.id.button7);
        result.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(scoreOfTeamA>scoreOfTeamB){
                    Intent i=new Intent(MainActivity.this,ResultActivity.class);
                    i.putExtra("key","CONGRATS TEAM A FOR WIN");
                    startActivityForResult(i, 1);
                }
                if (scoreOfTeamA<scoreOfTeamB) {

                    Intent i=new Intent(MainActivity.this,ResultActivity.class);
                    i.putExtra("key","CONGRATS TEAM B FOR WIN");
                    startActivityForResult(i, 1);
                }

                if (scoreOfTeamA==scoreOfTeamB) {
                    Intent i=new Intent(MainActivity.this,ResultActivity.class);
                    i.putExtra("key","Match Drawn");
                    startActivityForResult(i, 1);
                }
            }
        });
        resetButton=(Button)findViewById(R.id.button8);
        resetButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                scoreOfTeamA =0;
                scoreOfTeamB =0;
                updateTeamAScore();
                updateTeamBScore();
            }
        });
    }
    public void  updateTeamAScore() {
        TextView t1=(TextView)findViewById(R.id.textView2);
        t1.setText(String.valueOf(scoreOfTeamA));
    }
    public void  updateTeamBScore() {
        TextView t2=(TextView)findViewById(R.id.textView4);
        t2.setText(String.valueOf(scoreOfTeamB));

    }
}