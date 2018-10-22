package com.example.sweet.pandemicgamestate.objectclasses;

import java.util.HashMap;

public class GeneralCards
{
    int cardID;
    int diseaseColor;
    City location;
    boolean infectionCard;
    //each card is a hash map
    //it contains cardID, location, disease color
    //cardID, location, diseaseColor, infectionCard

    public GeneralCards()//int newCardID, City city, int color
    {
        //cardID = newCardID;
        //location = city;
       // diseaseColor = color;
    }

    //if infectionCard boolean is true, it's an infection card
    HashMap<Boolean, GeneralCards> infectionCards= new HashMap<>();

    //if infectionCard boolean is false, its a player card
    HashMap<Boolean, GeneralCards> playerCards= new HashMap<>();

    /*
    color 1 = yellow
    color 2 = blue
    color 3 = black
    color 4 = red
     */

    //GeneralCards card1 = new GeneralCards(getResourceID, cityObject, 1);
    //playerCards.put(false, card1)


    //GeneralCards card1 = new GeneralCards(getResourceID, cityObject, 1);
}
