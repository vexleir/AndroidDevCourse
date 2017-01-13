package com.example.mjschult.useroutput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        Toast.makeText(getApplicationContext(), "Hi Matt", Toast.LENGTH_LONG).show();
        EditText myTextField = (EditText) findViewById(R.id.textField);
        Log.i("Textfield Value", myTextField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
