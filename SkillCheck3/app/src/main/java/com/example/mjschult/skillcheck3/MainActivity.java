package com.example.mjschult.skillcheck3;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){
        //EditText myText = (EditText) findViewById(R.id.editText);
        ImageView kyloDisplay = (ImageView) findViewById(R.id.imageView);

        Drawable kylo2 = getResources().getDrawable (R.drawable.kylo2, );
        kyloDisplay.setImageResource(kylo2);

        Toast.makeText(getApplicationContext(), "Hi " + myText.getText().toString(), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
