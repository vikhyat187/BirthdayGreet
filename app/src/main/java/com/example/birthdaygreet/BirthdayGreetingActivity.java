package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class BirthdayGreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);
        Intent intent = getIntent();
        String name =intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

//        Capture the layouts text view and set the value to the var value
        TextView textView =findViewById(R.id.BirthdayGreeting);
        textView.setText(name);
    }
}