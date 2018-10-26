package com.example.sweet.pandemicgamestate.objectclasses;

/*
Event: Resilient Population
Remove any 1 card in the Infection Discard Pile from the Game
You may play this between the Infect and Intensify steps of an epidemic [this bit is after you draw the bottom card, but before you shuffle and put them back on top]

Event: One Quiet Night
Skip the next Infect Cities step (Do not flip over any infection cards)

Event: Forecast
Draw, Look at, and Rearrange the top 6 cards of the Infection deck
Put them back on top.

Event: Government Grant
Add 1 research station to any city (no city card needed)

Event: Airlift
Move any 1 pawn to any city
Get permission first [I don't think we care right now
 */

public class EventCard extends Card
{
    boolean isAction;
    boolean resilientPopulation;
    boolean quietNight;
    boolean forecast;
    boolean governmentGrant;
    boolean airlift;

    public EventCard(boolean isItAction, boolean isResilient, boolean isQuietNight, boolean isForecast, boolean isGovernment, boolean isAirlift)
    {
        isAction = isItAction;
        resilientPopulation = isResilient;
        quietNight = isQuietNight;
        forecast = isForecast;
        governmentGrant = isGovernment;
        airlift = isAirlift;

    }
    public EventCard()
    {

    }

}
