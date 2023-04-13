package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_add,btn_sub,btn_mult,btn_div,btn_clear;
    TextView textView_result;
    EditText edt_1,edt_2;

double a,b,c;
int flag=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn_add = findViewById(R.id.btn_add);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mult = findViewById(R.id.btn_mult);
        btn_div = findViewById(R.id.btn_div);
        textView_result = findViewById(R.id.textView_result);
        edt_1 = findViewById(R.id.edt_1);
        edt_2 = findViewById(R.id.edt_2);
        btn_clear = findViewById(R.id.btn_clear);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             get();
             if(flag==0){
             c= a+b;
               textView_result.setText(""+c);
            }
             else {
                 textView_result.setText("0");
             }
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                get();
                if (flag == 0) {
                    c = a - b;
                    textView_result.setText("" + c);
                } else {
                    textView_result.setText("0");
                }
            }
        });

        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                get();
                if (flag == 0) {
                    c = a * b;
                    textView_result.setText("" + c);
                }
                else {
                    textView_result.setText("0");
                }

            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                get();
                if(flag==0){
                c= a/b;
                textView_result.setText(""+c);
            }
                else {
                    textView_result.setText("0");
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("0");
            }
        });

    }



    public void get() {
        String s1 = edt_1.getText().toString();
        String s2 = edt_2.getText().toString();

        if (!s1.equals("") && !s2.equals("")) {
            a = Double.parseDouble(s1);
            b = Double.parseDouble(s2);
            flag=0;
        }
        else {
            flag=1;
        }
    }
}