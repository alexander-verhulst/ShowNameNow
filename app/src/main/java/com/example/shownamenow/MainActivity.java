package com.example.shownamenow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //fetch the button and text view id by creating variables
    private Button myButton;
    private TextView showText;
    private EditText enterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //all the magic occurs here
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //instantiate the button
        myButton = findViewById(R.id.button);

        //instantiate the text input box
        enterName = findViewById(R.id.editText);



        //this allows the button action to be performed
        //The click listener method waits for the user to tap on the button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Retrieves the name that user inputs
                String name = enterName.getText().toString();

                showText.setText("Hello " + name);
            }
        });

        showText = findViewById(R.id.textView);





    }
}
