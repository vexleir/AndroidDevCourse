package com.example.mjschult.useroutput;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {


        //EditText myTextField = (EditText) findViewById(R.id.textField);
        ImageView kyloImage = (ImageView) findViewById(R.id.myImage);

        // kyloImage.setImageDrawable(getResources().getDrawable(R.drawable.kylo2, getApplicationContext().getTheme()));
        kyloImage.setImageResource(R.drawable.kylo2);

        //Toast.makeText(getApplicationContext(), "Hi " + myTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
