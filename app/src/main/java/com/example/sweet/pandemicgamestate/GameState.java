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
    GeneralCards p1Cards;
    GeneralCards p2Cards;
    RoleCards p1Role;
    RoleCards p2Role;
    Pawn p1Pawn;
    Pawn p2Pawn;
    int numPlayers;
    int playerTurn;
    int infectionRate;
    int outbreakNum;
    int actionsLeft;
    int[] curedDiseases;
    String playerCity;

    GameState(){
        p1Cards = null;
        p2Cards = null;
        p1Role = null;
        p2Role = null;
        p1Pawn = null;
        p2Pawn = null;
        numPlayers = 2;
        playerTurn = 0;
        infectionRate = 2;
        outbreakNum = 0;
        actionsLeft = 4;
        curedDiseases = new int[] {0,0,0,0}; //1 = cured, 2 = eradicated
        playerCity = "New York"; //city that player is located at

    }

//empty action methods
public boolean movePawn()
{
    //drive, direct flight, charter flight, shuttle flight, dispatcher, operations expert
    return false;
}
public boolean drawCard (int playersTurn, int infectionRate)
{
    return false;
}
public boolean discardCard (int playersTurn,  int infectionRate)
{
    return false;
}
public boolean buildAResearchStation (int playersTurn, String playerCity, GeneralCards gc, RoleCards rc)
{
    //normal, operations expert
    return false;
}
public boolean treatDisease (int playersTurn, String playerCity, RoleCards rc)
{
    //normal, medic
    return false;
}
public boolean discoverACure (int playersTurn, String playerCity, GeneralCards gc,RoleCards rc)
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

    public int getNumPlayers() {
        return numPlayers;
    }

    public GeneralCards getP1Cards() {
        return p1Cards;
    }

    public GeneralCards getP2Cards() {
        return p2Cards;
    }

    public int getInfectionRate() {
        return infectionRate;
    }

    public Pawn getP1Pawn() {
        return p1Pawn;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public int getOutbreakNum() {
        return outbreakNum;
    }

    public Pawn getP2Pawn() {
        return p2Pawn;
    }

    public RoleCards getP1Role() {
        return p1Role;
    }

    public RoleCards getP2Role() {
        return p2Role;
    }

    public int getActionsLeft() {
        return actionsLeft;
    }

    public int[] getCuredDiseases() {
        return curedDiseases;
    }

    public String getPlayerCity() {
        return playerCity;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void setP1Cards(GeneralCards p1Cards) {
        this.p1Cards = p1Cards;
    }

    public void setP1Pawn(Pawn p1Pawn) {
        this.p1Pawn = p1Pawn;
    }

    public void setP1Role(RoleCards p1Role) {
        this.p1Role = p1Role;
    }

    public void setP2Cards(GeneralCards p2Cards) {
        this.p2Cards = p2Cards;
    }

    public void setP2Pawn(Pawn p2Pawn) {
        this.p2Pawn = p2Pawn;
    }

    public void setP2Role(RoleCards p2Role) {
        this.p2Role = p2Role;
    }

    public void setActionsLeft(int actionsLeft) {
        this.actionsLeft = actionsLeft;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }

    public void setCuredDiseases(int[] curedDiseases) {
        this.curedDiseases = curedDiseases;
    }

    public void setInfectionRate(int infectionRate) {
        this.infectionRate = infectionRate;
    }

    public void setOutbreakNum(int outbreakNum) {
        this.outbreakNum = outbreakNum;
    }

    public void setPlayerCity(String playerCity) {
        this.playerCity = playerCity;
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