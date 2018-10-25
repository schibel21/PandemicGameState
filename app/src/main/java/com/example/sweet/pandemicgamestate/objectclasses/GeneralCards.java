package com.example.sweet.pandemicgamestate.objectclasses;

public class GeneralCards
{
    City location;
    int diseaseColor;
    boolean infectionCard;
    boolean isEvent;
    boolean isEpidemic;

    public GeneralCards(City city, int color, boolean isInfection, boolean isItEvent, boolean isItEpidemic)
    {
        location = city;
        diseaseColor = color;
        infectionCard = isInfection;
        isEvent = isItEvent;
        isEpidemic = isItEpidemic;
    }


}
