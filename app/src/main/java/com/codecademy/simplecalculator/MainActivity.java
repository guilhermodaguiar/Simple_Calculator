package com.codecademy.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstNumber = findViewById(R.id.Number1);
        EditText secondNumber = findViewById(R.id.Number2);
        RadioGroup operators = findViewById(R.id.operators);
        RadioButton add = findViewById(R.id.add);
        RadioButton substract = findViewById(R.id.Subtract);
        Button equals = findViewById(R.id.equals);
        TextView result = findViewById(R.id.result);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int firstNumberValue = Integer.parseInt(firstNumber.getText().toString());
                final int secondNumberValue = Integer.parseInt(secondNumber.getText().toString());

                final int operatorButtonId = operators.getCheckedRadioButtonId();
                Integer answer;
                // Je kan ook add.getId() gebruiken ipv R.id.add.
                if (operatorButtonId == R.id.add) {
                    answer = firstNumberValue + secondNumberValue;
                } else {
                    answer = firstNumberValue - secondNumberValue;
                }
                result.setText(answer.toString());
            }
        });
    }
}