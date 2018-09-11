package com.example.zhou.zy_week1_class1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss" );
    Date curDate = new Date(System.currentTimeMillis());
    String str = format.format(curDate);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_main_layout);

        Button bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello 16211160127  " + str,Toast.LENGTH_LONG).show();
            }
        });
    }
}
