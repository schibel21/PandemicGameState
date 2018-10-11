package com.example.sweet.pandemicgamestate;

/************************************
 * GAME STATE VARIABLES
 *  -Cards: card
 *  -Pawns: pawn
 *  -numOfPlayers: int
 *  -playerTurn: String
 *  -actionsLeft: int
 *  -infectionRate: int
 *  -outbreakNum: int
 *  -curedDiseases: int[]
 *
 *
 ************************************/

import com.example.sweet.pandemicgamestate.objectclasses.GeneralCards;
import com.example.sweet.pandemicgamestate.objectclasses.Pawn;
import com.example.sweet.pandemicgamestate.objectclasses.RoleCards;

/************************************
 * GameState Constructor
 * Initializes a 2-player game
 * where neither players have any
 * cards or pawns yet and it is
 * player 1's turn.
 ************************************/
public class GameState {
    GeneralCards p1Cards = null;
    GeneralCards p2Cards = null;
    RoleCards p1Role = null;
    RoleCards p2Role = null;
    Pawn p1Pawn = null;
    Pawn p2Pawn = null;
    int numOfPlayers = 2;
    String playerTurn = "player 1";
    int infectionRate = 2;
    int outbreakNum = 0;
    int actionsLeft = 4;
    int[] curedDiseases = new int[] {0,0,0,0}; //1 = cured, 2 = eradicated


//empty action methods
public boolean movePawn()
{
    //drive, direct flight, charter flight, shuttle flight, dispatcher, operations expert
    return false;
}
public boolean drawCard (String playersTurn, int infectionRate)
{
    return false;
}
public boolean discardCard (String playersTurn,  int infectionRate)
{
    return false;
}
public boolean buildAResearchStation ()
{
    //normal, operations expert
    return false;
}
public boolean treatDisease ()
{
    //normal, medic
    return false;
}
public boolean discoverACure ()
{
    //normal, scientist
    return false;
}
public boolean increaseInfectionRate ()
{
    return false;
}
public boolean infect ()
{
    //normal, epidemic, outbreak
    return false;
}
public boolean intensify ()
{
    //reshuffling and adding
    return false;
}
public boolean shareKnowledge ()
{
    //normal, researcher
    return false;
}
public boolean playEventCard()
{
    return false;
}
public boolean placeEventCardOnRoleCardFromDiscardPile ()
{
    //contingency planner only
    return false;
}
public boolean removeCardFromGame ()
{
    //epidemic, contingency planner
    return false;
}
}



/*
//Dummied up toString method because it was
//giving me issues lol. -K

@Override
public String toString(){
    String gameSS = "";


    return gameSS;
}*/