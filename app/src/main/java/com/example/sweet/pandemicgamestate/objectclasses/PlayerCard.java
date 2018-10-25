package com.example.sweet.pandemicgamestate.objectclasses;

public class PlayerCard extends Card{

    City location;
    int diseaseColor;
    boolean infectionCard;
    boolean isEvent;
    boolean isEpidemic;

    public PlayerCard(City city, int color, boolean isItEpidemic)
    {
        location = city;
        diseaseColor = color;
        isEpidemic = isItEpidemic;
    }
}
