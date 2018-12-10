package com.gavblaze.android.pickerfordate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePicker(View view) {
        DatePickerFragment fragment = new DatePickerFragment();
        fragment.show(getSupportFragmentManager(), "datePicker");

    }

    public void processDatePickerResult(int year, int month, int day) {
        String y = String.valueOf(year);
        String m = String.valueOf(month + 1);
        String d = String.valueOf(day);
        String fullDate = d + "/" + m + "/" + y;
        Toast.makeText(this, fullDate , Toast.LENGTH_SHORT).show();
    }
}
