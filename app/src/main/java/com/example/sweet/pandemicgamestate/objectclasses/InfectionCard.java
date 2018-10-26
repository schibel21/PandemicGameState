package com.example.sweet.pandemicgamestate.objectclasses;

public class InfectionCard extends Card
{

    City location;
    int diseaseColor;

    //Constructor
    public InfectionCard(City city, int color)
    {
        location = city;
        diseaseColor = color;
    }

    //Copy constructor
    public InfectionCard(InfectionCard otherCard){
        this.location = otherCard.location;
        this.diseaseColor = otherCard.diseaseColor;


    }
}
