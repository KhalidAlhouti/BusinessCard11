package com.example.businesscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt1 = (TextView) findViewById(R.id.textView);
        final TextView txt2 = (TextView) findViewById(R.id.textView2);
        final TextView txt3 = (TextView) findViewById(R.id.textView3);
        final EditText edit1 = (EditText) findViewById(R.id.editTextTextEmailAddress);
        final EditText edit2 = (EditText) findViewById(R.id.editTextTextPersonName);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final Button bttn = (Button) findViewById(R.id.button);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, h2.class);
                startActivity(intent);
            }
        });


    }
}