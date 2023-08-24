package com.example.sepuluhbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView displayTextView;
    private int buttonCounter = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayTextView = findViewById(R.id.displayTextView);
        ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button0 = findViewById(R.id.button0);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biarGampang("1");
                changeBackground(constraintLayout);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biarGampang("2");
                changeBackground(constraintLayout);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biarGampang("3");
                changeBackground(constraintLayout);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biarGampang("4");
                changeBackground(constraintLayout);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biarGampang("5");
                changeBackground(constraintLayout);;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biarGampang("6");
                changeBackground(constraintLayout);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biarGampang("7");
                changeBackground(constraintLayout);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biarGampang("8");
                changeBackground(constraintLayout);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biarGampang("9");
                changeBackground(constraintLayout);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biarGampang("0");
                changeBackground(constraintLayout);
            }
        });
    }

    private void biarGampang(String textBaru) {
        String textBarusan = displayTextView.getText().toString();
        displayTextView.setText(textBarusan + textBaru);
    }

    private void changeBackground(ConstraintLayout layout) {
        int[] colors = {
                android.R.color.holo_red_light,
                android.R.color.holo_green_light,
                android.R.color.holo_blue_light,
                android.R.color.holo_orange_light
        };

        layout.setBackgroundResource(colors[buttonCounter % colors.length]);
        buttonCounter++;
    }
}
