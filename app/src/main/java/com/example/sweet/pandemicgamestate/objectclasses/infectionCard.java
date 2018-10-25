package com.example.sweet.pandemicgamestate.objectclasses;

public class infectionCard extends Card
{

    City location;
    int diseaseColor;

    public infectionCard(City city, int color)
    {
        location = city;
        diseaseColor = color;
    }
}
