package com.example.a2textfildmath;



import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner operationSpinner;
    EditText t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operationSpinner = findViewById(R.id.operation_spinner);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.operations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        operationSpinner.setAdapter(adapter);

        operationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                calculate();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing
            }
        });
    }

    private void calculate() {
        double num1 = Double.parseDouble(t1.getText().toString());
        double num2 = Double.parseDouble(t2.getText().toString());

        double result = 0;

        switch (operationSpinner.getSelectedItemPosition()) {
            case 0: // Add
                result = num1 + num2;
                break;
            case 1: // Subtract
                result = num1 - num2;
                break;
            case 2: // Multiply
                result = num1 * num2;
                break;
            case 3: // Divide
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
        }

        t3.setText(String.valueOf(result));
    }
}
