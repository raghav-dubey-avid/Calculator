package com.example.kiit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Double.NaN;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button equal;
    private Button clear;
    private TextView info;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBSTRACTION = '-';
    private final char DIVISION = '/';
    private final char EQU = '=';
    private final char MULTIPLICATION = '*';
    private double val1 = NaN;
    private double val2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();


        //setting onclick Buttons
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }

        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }

        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }

        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }

        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }

        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }

        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }

        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }

        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }

        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }

        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);
            }

        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBSTRACTION;
                result.setText(String.valueOf(val1) + "-");
                info.setText(null);
            }

        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1) + "*");
                info.setText(null);
            }

        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);
            }

        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                info.setText(null);
            }

        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (info.getText().length() > 0) {
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length() - 1));

                } else {
                    val1 = NaN;
                    val2 = NaN;
                    info.setText(null);
                    result.setText(null);
                }


            }

        });

    }
        private void setupUIViews () {
            zero = findViewById(R.id.btm0);
            one =  findViewById(R.id.btm1);
            two = (Button) findViewById(R.id.btm2);
            three = (Button) findViewById(R.id.btm3);
            four = (Button) findViewById(R.id.btm4);
            five = (Button) findViewById(R.id.btm5);
            six = (Button) findViewById(R.id.btm6);
            seven = (Button) findViewById(R.id.btm7);
            eight = (Button) findViewById(R.id.btm8);
            nine = (Button) findViewById(R.id.btm9);
            add = (Button) findViewById(R.id.btmadd);
            sub = (Button) findViewById(R.id.btmsub);
            mul = (Button) findViewById(R.id.btmMul);
            div = (Button) findViewById(R.id.btmdiv);
            info = (TextView) findViewById(R.id.tvdisplay);
            result = (TextView) findViewById(R.id.tvResult);
            equal = (Button) findViewById(R.id.btmequals);
            clear = (Button) findViewById(R.id.btmclear);
        }

        private void compute () {
            if (!Double.isNaN(val1)) {
                val2 = Double.parseDouble(info.getText().toString());

                switch (ACTION) {
                    case ADDITION:
                        val1 = val1 + val2;
                        break;
                    case SUBSTRACTION:
                        val1 = val1 - val2;
                        break;
                    case MULTIPLICATION:
                        val1 = val1 * val2;
                        break;
                    case DIVISION:
                        val1 = val1 / val2;
                        break;
                    case EQU:
                        break;


                }
            } else {
                val1 = Double.parseDouble(info.getText().toString());
            }

        }

}

