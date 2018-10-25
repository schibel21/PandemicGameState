/***********************
 @Kelsi
 @Joanna
 @Polina
 @Sarah
************************/

package com.example.sweet.pandemicgamestate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sweet.pandemicgamestate.objectclasses.City;
import com.example.sweet.pandemicgamestate.objectclasses.GeneralCards;

//External citation:
// https://images-cdn.zmangames.com/us-east-1/filer_public/25/12/251252dd-1338-4f78-b90d-afe073c72363/zm7101_pandemic_rules.pdf
//Used for knowing the rules and layout of Pandemic, referenced throughout all code
public class MainActivity extends AppCompatActivity {

    EditText edTe;
    City london = new City("London");
    GeneralCards sampleCard = new GeneralCards(london, 0, false, false, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTe = (EditText) findViewById(R.id.editText);

        Button testButton = findViewById(R.id.runTestButton);
            ButtonListener testListener = new ButtonListener();
            testButton.setOnClickListener(testListener);

    }

    @Override
    //External Citation:
    //https://developer.android.com/guide/topics/ui/menus
    //Referenced android documentation for how to create menus
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        int itemID = menuItem.getItemId();
        if(itemID == R.id.exitGameMenuItem)
        {
            //do action
            //surfaceView.invalidate()
            return true;
        }
        else if(itemID == R.id.restartMenuItem)
        {
            //do action
            //surfaceView.invalidate()
            return true;
        }
        else if(itemID == R.id.settings)
        {
            //do action
            //surfaceView.invalidate()
            return true;
        }
        else if (itemID == R.id.changeAIDifficulty)
        {
            //do action
            //surfaceView.invalidate()
            return true;
        }
        return false;
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
            firstInstance.movePawn(0, firstInstance.getActionsLeft());
            edTe.append("Player 0 has moved their pawn.\n");

            firstInstance.drawPlayerCard(0,2);
            edTe.append("Player 0 has drawn 2 player cards.\n");

            firstInstance.discardPlayerCard(0,1,sampleCard);
            edTe.append("Player 0 had a full hand and discarded 1 card.\n");

            firstInstance.drawInfectionCard(1,2);
            edTe.append("Player 1 has drawn 2 infection cards.\n");

            firstInstance.infect(1);
            edTe.append("Player 1 has infected cities.\n");

            firstInstance.discardInfectionCard(1,2);
            edTe.append("Player 1 has discarded 2 infection cards.\n");

            firstInstance.buildAResearchStation(0, "New York",
            sampleCard);
            edTe.append("Player 0 has built a research station in New York.\n");

            firstInstance.treatDisease(1, "New York");
            edTe.append("Player 1 has treated disease in New York.\n");

            firstInstance.discoverACure(1, "New York", sampleCard);
            edTe.append("Player 1 has discovered a cure in New York.\n");

            firstInstance.increaseInfectionRate(1);
            edTe.append("Infection rate has been increased to 3.\n");

            firstInstance.intensify(1);
            edTe.append("The game has been intensified.\n");

            firstInstance.shareKnowledge(1);
            edTe.append("Knowledge has been shared with Player 0.\n");

            firstInstance.playEventCard(1);
            edTe.append("Player 0 has played an event card.\n");

            //Creates a new instance of the game state class using default constructor.
            GameState thirdInstance = new GameState();

            //Creates a deep copy of thirdInstance using copy constructor.
            GameState fourthInstance = new GameState(firstInstance);

            //Call toString on second and fourth instance. Should produce identical results.
            edTe.append("First instance to string: " +firstInstance.toString() + "\n");
            edTe.append("Second instance to string: " +secondInstance.toString() + "\n");
            edTe.append("Fourth instance to string: " +fourthInstance.toString() + "\n");


        }
    }

}
