package com.example.sweet.pandemicgamestate.objectclasses;

public class InfectionCard extends Card
{

    City location;
    int diseaseColor;

    public InfectionCard(City city, int color)
    {
        location = city;
        diseaseColor = color;
    }
}
