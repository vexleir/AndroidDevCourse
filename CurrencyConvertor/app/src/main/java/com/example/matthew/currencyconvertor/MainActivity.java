package com.example.matthew.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view){
        EditText amountView = (EditText) findViewById(R.id.curencyAmount);

        float amount = Float.valueOf(amountView.getText().toString());

        float conversion = amount * 0.81f;

        Toast.makeText(getApplicationContext(), Float.toString(conversion), Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
