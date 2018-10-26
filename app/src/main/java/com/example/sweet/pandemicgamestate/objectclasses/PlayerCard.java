package com.example.sweet.pandemicgamestate.objectclasses;

public class PlayerCard extends Card{

    City location;
    int diseaseColor;
    boolean isEpidemic;

    public PlayerCard(City city, int color, boolean isItEpidemic)
    {
        location = city;
        diseaseColor = color;
        isEpidemic = isItEpidemic;

    }
    //copy constructor
    public PlayerCard(PlayerCard playerCard)
    {
        this.location = new City(playerCard.location);
        this.diseaseColor = playerCard.diseaseColor;
        this.isEpidemic = playerCard.isEpidemic;



    }
}
