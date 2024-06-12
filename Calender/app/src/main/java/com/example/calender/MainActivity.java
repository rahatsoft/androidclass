package com.example.calender;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private Button submitButton;
    private TextView selectedDateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize DatePicker, Button, and TextView
        datePicker = findViewById(R.id.date_picker);
        submitButton = findViewById(R.id.submit_button);
        selectedDateText = findViewById(R.id.selected_date_text);

        // Set OnClickListener for the button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the selected date from DatePicker
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1; // Month is 0 based, so add 1
                int year = datePicker.getYear();

                // Display the selected date
                String selectedDate = day + "/" + month + "/" + year;

                // Set the selected date to the TextView
                selectedDateText.setText("Selected Date: " + selectedDate);

                // Display the selected date in a toast
                Toast.makeText(MainActivity.this, "Selected Date: " + selectedDate, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
