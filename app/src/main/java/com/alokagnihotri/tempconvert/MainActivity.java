package com.alokagnihotri.tempconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextNumber;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String S = editTextNumber.getText().toString();
                int degreecelsius = Integer.parseInt(S);
                double degreefahrenheit = (degreecelsius*1.8)+32;
                textView.setText("The converted temperature in °F is "+degreefahrenheit+" °F");
                Toast.makeText(MainActivity.this, "Thanks for using this app !!", Toast.LENGTH_SHORT).show();



            }
        });


    }
}