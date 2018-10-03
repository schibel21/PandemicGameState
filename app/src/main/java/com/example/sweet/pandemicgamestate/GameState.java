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
 *
 *
 ************************************/




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
    //Pawn p1Pawn = null;
    //Pawn p2Pawn = null;
    int numOfPlayers = 2;
    String playerTurn = "player 1";
    int infectionRate = 2;
    int outbreakNum = 0;
    int actionsLeft = 4;

}



/*
//Dummied up toString method because it was
//giving me issues lol. -K

public String toString(){
    String gameSS = "";


    return gameSS;
}*/
