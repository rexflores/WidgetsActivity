package com.example.widgetsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.widgetsactivity.MainActivity;
import com.example.widgetsactivity.R;


public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView nameView = findViewById(R.id.name_view);
        TextView casView = findViewById(R.id.cas_view);
        TextView genView = findViewById(R.id.gen_view);
        TextView bdayView = findViewById(R.id.bday_view);
        TextView schoolView = findViewById(R.id.school_view);
        TextView contactView = findViewById(R.id.contact_view);


        nameView.setText(MainActivity.getName());
        casView.setText(MainActivity.getCas());
        genView.setText(MainActivity.getGen());
        bdayView.setText(MainActivity.getBday());
        schoolView.setText(MainActivity.getSchool());
        contactView.setText(MainActivity.getContact());

    }
}
