package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE ="com.example.birthdaygreet.MESSAGE" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void createBirthdayCard(View view) {
        EditText editText=(EditText) findViewById(R.id.editTextTextPersonName3);
        String name = editText.getText().toString();
        Intent intent =new Intent(this,BirthdayGreetingActivity.class);
        intent.putExtra(EXTRA_MESSAGE,name);
        startActivity(intent);
    }
}