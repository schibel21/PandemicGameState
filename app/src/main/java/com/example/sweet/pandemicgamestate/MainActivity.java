/***********************
 @Kelsi
 @Joanna
 @Polina
 @Sarah
************************/
package com.example.sweet.pandemicgamestate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sweet.pandemicgamestate.objectclasses.GeneralCards;
import com.example.sweet.pandemicgamestate.objectclasses.RoleCards;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edTe = findViewById(R.id.editText);
    GeneralCards sampleCard = new GeneralCards();
    RoleCards sampleRole = new RoleCards();

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
            //Clears edit text
            edTe.setText(" ");

            //Creates a new instance of the game state class using default constructor
            GameState firstInstance = new GameState();

            //Creates a deep copy of firstInstance using copy constructor.
            GameState secondInstance = new GameState(firstInstance);

            //Method call and print statements.
            firstInstance.movePawn(0, firstInstance.actionsLeft);
            edTe.append("Player 0 has moved their pawn.\n");

            firstInstance.drawPlayerCard(0,2);
            edTe.append("Player 0 has drawn 2 player cards.\n");

            firstInstance.discardPlayerCard(0,1, firstInstance.p1Cards);
            edTe.append("Player 0 had a full hand and discarded 1 card.\n");

            firstInstance.drawInfectionCard(1,2);
            edTe.append("Player 1 has drawn 2 infection cards.\n");

            firstInstance.infect(1);
            edTe.append("Player 1 has infected cities.\n");

            firstInstance.discardInfectionCard(1,2);
            edTe.append("Player 1 has discarded 2 infection cards.");

            firstInstance.buildAResearchStation(0, "New York",
            sampleCard, sampleRole);
            edTe.append("Player 0 has built a research station in New York.\n");

            firstInstance.treatDisease(1, "New York", sampleRole);
            edTe.append("Player 1 has treated disease in New York.\n");

            firstInstance.discoverACure(1, "New York", sampleCard, sampleRole);
            edTe.append("Player 1 has discovered a cure in New York.\n");

            firstInstance.increaseInfectionRate(1);
            edTe.append("Infection rate has been increased to 3.\n");

            firstInstance.intensify(1);
            edTe.append("The game has been intensified.\n");

            firstInstance.shareKnowledge(1);
            edTe.append("Knowledge has been shared with Player 0.\n");

            firstInstance.playEventCard(1);
            edTe.append("Player 0 has played an event card.\n");






        }
    }

}
