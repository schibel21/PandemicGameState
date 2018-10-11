package com.example.sweet.pandemicgamestate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button testButton = findViewById(R.id.runTestButton);
        EditText edTe = findViewById(R.id.editText);

    }



    public class ButtonListener implements View.OnClickListener {
        public void onClick(View Button) {
            //should clear edTe
            GameState firstInstance = new GameState();

        }
    }


}
