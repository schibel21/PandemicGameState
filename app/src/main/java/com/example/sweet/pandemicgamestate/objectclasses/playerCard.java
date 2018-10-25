package com.example.sweet.pandemicgamestate.objectclasses;

public class playerCard extends Card{

    City location;
    int diseaseColor;
    boolean infectionCard;
    boolean isEvent;
    boolean isEpidemic;

    public playerCard(City city, int color, boolean isItEpidemic)
    {
        location = city;
        diseaseColor = color;
        isEpidemic = isItEpidemic;
    }
}
