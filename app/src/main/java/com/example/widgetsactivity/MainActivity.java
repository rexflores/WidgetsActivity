package com.example.widgetsactivity;

import static com.example.widgetsactivity.R.*;
import android.annotation.SuppressLint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.example.widgetsactivity.R;
import android.app.DatePickerDialog;
import java.util.Calendar;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static String name;
    public static String getName() {
        return name;
    }

    private static String cas;
    public static String getCas() {
        return cas;
    }

    private static String gen;
    public static String getGen() {
        return gen;
    }

    private static String bday;
    public static String getBday() {
        return bday;
    }

    private static String school;
    public static String getSchool() {
        return school;
    }

    private static String contact;
    public static String getContact() {
        return contact;
    }

    @Override
    @SuppressLint("SetTextI18n")

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name_text = findViewById(R.id.name_text);
        EditText cas_text = findViewById(R.id.cas_text);
        RadioButton male_text = findViewById(R.id.male_text);
        RadioButton female_text = findViewById(R.id.female_text);
        EditText bday_text = findViewById(R.id.bday_text);
        Button bdayButton = findViewById(R.id.bday_button);
        EditText school_text = findViewById(R.id.school_text);
        EditText contact_text = findViewById(R.id.contact_text);
        Button button = findViewById(R.id.next_button);
        Calendar calendar = Calendar.getInstance();

        bdayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                String selectedDate = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
                                bday_text.setText(selectedDate);
                            }
                        },
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH));

                datePickerDialog.show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("SetTextI18n")

            public void onClick(View v) {
                name = name_text.getText().toString().trim();
                cas = cas_text.getText().toString().trim();

                if(male_text.isChecked()){
                    gen= male_text.getText().toString().trim();
                }
                if(female_text.isChecked()){
                    gen= female_text.getText().toString().trim();
                }

                bday = bday_text.getText().toString().trim();
                school = school_text.getText().toString().trim();
                contact = contact_text.getText().toString().trim();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

}
