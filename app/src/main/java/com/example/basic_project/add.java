package com.example.basic_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;

public class add extends AppCompatActivity {
    EditText et1,et2;
    TextView tv33;
    Button b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        et1=findViewById(R.id.et1);
        tv33=findViewById(R.id.tv33);
        b12=findViewById(R.id.b12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    double a,b,c;
                    a=Double.parseDouble((et1.getText().toString()));
                    b=Double.parseDouble((et2.getText().toString()));
                    c=a+b;
                    tv33.setText(c+"");

            }
        });

    }
}
