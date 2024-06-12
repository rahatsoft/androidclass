package com.example.add_multy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText t1, t2, t3;
    RadioGroup operationRadioGroup;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        operationRadioGroup = findViewById(R.id.operation_radio_group);
        calculateButton = findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    private void calculate() {
        double num1 = Double.parseDouble(t1.getText().toString());
        double num2 = Double.parseDouble(t2.getText().toString());

        int selectedId = operationRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedId);
        String operation = selectedRadioButton.getText().toString();

        double result = 0;

        switch (operation) {
            case "Add":
                result = num1 + num2;
                break;
            case "Subtract":
                result = num1 - num2;
                break;
            case "Multiply":
                result = num1 * num2;
                break;
            case "Divide":
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
        }

        t3.setText(String.valueOf(result));
    }
}
