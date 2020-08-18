package com.example.student.intentsproj;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        String n1 = i.getStringExtra("EXTRA_1");
        String n2 = i.getStringExtra("Extra_2");

        Button btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //retrive the edit text numbers

                Integer i1= Integer.parseInt(n1);
                Integer i2= Integer.parseInt(n2);

                String result = "";

                result = n1+"+"+n2+"+"+(n1+n2);

                TextView tv = findViewById(R.id.TvResult);

            }
        }
        )
    }
}
