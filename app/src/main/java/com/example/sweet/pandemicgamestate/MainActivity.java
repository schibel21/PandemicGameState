package com.example.sweet.pandemicgamestate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edTe = findViewById(R.id.editText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button testButton = findViewById(R.id.runTestButton);
            ButtonListener testListener = new ButtonListener();
            testButton.setOnClickListener(testListener);
    }



    public class ButtonListener implements View.OnClickListener {
        public void onClick(View Button) {
            //Clears EditText
            edTe.setText(" ");
            GameState firstInstance = new GameState(); //Creates

        }
    }


}
