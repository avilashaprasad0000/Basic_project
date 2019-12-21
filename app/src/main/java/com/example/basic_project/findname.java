package com.example.basic_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class findname extends AppCompatActivity {
TextView tv5;
EditText et1,et2;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findname);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv5=findViewById(R.id.tv5);
        b1=findViewById(R.id.b11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1, s2;
                s1=et1.getText().toString();
                s2=et2.getText().toString();
                if(s1.contains(s2))
                    tv5.setText("Your name is present");
                else
                    tv5.setText("Your name is not present");
            }
        });

    }
}
