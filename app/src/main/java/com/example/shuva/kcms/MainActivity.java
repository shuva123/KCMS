package com.example.shuva.kcms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
ProgressBar progressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressbar = (ProgressBar) findViewById(R.id.progressBar);
        //progressbar.setIndeterminate(true);
        progressbar.setProgress(0);

        final Intent i=new Intent(this,LoginActivity.class);
        final Thread t = new Thread() {
            int prg = 0;
            @Override
            public void run() {
                while (prg < 100) {
                    try {
                        sleep(200);
                        prg = prg + 10;
                        progressbar.setProgress(prg);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                if (prg==100){
                    //progressbar.setVisibility(View.GONE);
                    startActivity(i);
                }
            }
        };
        t.start();
        //progressbar.setIndeterminate(true);
        }
    }
