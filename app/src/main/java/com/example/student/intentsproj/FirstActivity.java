package com.example.student.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText etn1 , etn2;
    Button btns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        etn1 = findViewById(R.id.no1);
        etn2 = findViewById(R.id.no2);
        btns = findViewById(R.id.btnSend);

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(getApplicationContext(), "ok was clicked", Toast.LENGTH_LONG );

                toast.setGravity(Gravity.TOP| Gravity.CENTER,0, 0 );
                toast.show();

                String n1 = etn1.getText().toString();
                String n2 = etn2.getText().toString();

                Intent i = new Intent()
            }
        });
    }
}
