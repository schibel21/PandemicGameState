package com.example.sweet.pandemicgamestate;
/************************************
 * @Kelsi
 * @Johanna
 * @Sarah
 * @Polina
************************************/

/************************************
 * GAME STATE VARIABLES
 *  -Cards: card
 *      -General Cards: card
 *      -Role Cards: card
 *  -Pawns: pawn
 *  -numOfPlayers: int
 *  -playerTurn: String
 *  -actionsLeft: int
 *  -infectionRate: int
 *  -outbreakNum: int
 *  -curedDiseases: int[]
 *  -playerCity: String
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
    GeneralCards[] p1Cards;
    GeneralCards[] p2Cards;
    RoleCards p1Role;
    RoleCards p2Role;
    GeneralCards[] playerDeck;
    GeneralCards[] infectionDeck;

    Pawn p1Pawn;
    Pawn p2Pawn;
    int numPlayers;
    int playerTurn;
    int infectionRate;
    int outbreakNum;
    int actionsLeft;
    int[] curedDiseases;
    String playerCity;

    GameState() {
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
        curedDiseases = new int[] {0, 0, 0, 0}; //1 = cured, 2 = eradicated
        playerCity = "New York"; //city that player is located at

    }

    //copy constructor
    GameState(GameState otherState) {
        this.p1Cards = otherState.p1Cards;
        this.p2Cards = otherState.p2Cards;
        this.p1Role = otherState.p1Role;
        this.p2Role = otherState.p2Role;
        this.p1Pawn = otherState.p1Pawn;
        this.p2Pawn = otherState.p2Pawn;
        this.numPlayers = otherState.numPlayers;
        this.playerTurn = otherState.playerTurn;
        this.infectionRate = otherState.infectionRate;
        this.outbreakNum = otherState.outbreakNum;
        this.actionsLeft = otherState.actionsLeft;
        this.curedDiseases = otherState.curedDiseases;
        this.playerCity = otherState.playerCity;

    }

    @Override
    public String toString(){
        String empty4now = "";
        return empty4now;
    }

    //empty action methods
    public boolean movePawn(int playerTurn, int actionsLeft) {
        if(actionsLeft<=0){
            return false;
        }
        //drive, direct flight, charter flight, shuttle flight, dispatcher, operations expert
        return true;
    }

    public boolean drawPlayerCard(int playersTurn, int numCards) {
        if(numCards>7){
            return false;

        }
        return true;
    }

    public boolean drawInfectionCard(int playersTurn, int infectionRate) {
        return true;
    }

    public boolean discardPlayerCard(int playersTurn, int numCards, GeneralCards[] playerCards){
        if(playerCards == null){
            return false;
        }

        return true;
    }
    public boolean discardInfectionCard(int playersTurn, int infectionRate) {

        return true;
    }

    public boolean buildAResearchStation(int playersTurn, String playerCity, GeneralCards gc, RoleCards rc) {
        //normal, operations expert
        if(actionsLeft<=0){
            return false;
        }
        return true;
    }

    public boolean treatDisease(int playersTurn, String playerCity, RoleCards rc) {
        //normal, medic
        if(actionsLeft<=0){
            return false;
        }
        return true;
    }

    public boolean discoverACure(int playersTurn, String playerCity, GeneralCards gc, RoleCards rc) {
        //normal, scientist
        if(actionsLeft<=0){
            return false;
        }
        return true;
    }

    public boolean increaseInfectionRate(int playersTurn) {
        return true;
    }

    public boolean infect(int playersTurn) {
        //normal, epidemic, outbreak
        if(actionsLeft>0){
            return false;
        }
        return true;
    }

    public boolean intensify(int playersTurn) {
        //reshuffling and adding
        return true;
    }

    public boolean shareKnowledge(int playersTurn) {
        //normal, researcher
        if(actionsLeft<=0){
            return false;
        }
        return true;
    }

    public boolean playEventCard(int playersTurn) {
        if(actionsLeft<=0){
            return false;
        }
        //if(role = contingencyPlanner){
            //do action with different requirements.
        //}
        return true;
    }

    //@Override
    public void toString(GameState game)
    {
        System.out.print("\nPlayer 1 cards: " + game.p1Cards);
        System.out.print("\nPlayer 2 cards: " + game.p2Cards);
        System.out.print("\nPlayer 1 role: " + game.p1Role);
        System.out.print("\nPlayer 2 role: " + game.p2Role);
        System.out.print("\nPlayer 1 pawn: " + game.p1Pawn);
        System.out.print("\nPlayer 2 pawn: " + game.p2Pawn);
        System.out.print("\nNumber of players: " + game.numPlayers);
        System.out.print("\nWhich player's turn it is: " + game.playerTurn);
        System.out.print("\nThe infection rate is: " + game.infectionRate);
        System.out.print("\nThe amount of outbreaks that have occurred: " + game.outbreakNum);
        System.out.print("\nThe number of actions left: " + game.actionsLeft);

        int curedCount = 0;
        int eCount = 0;
        int oCount = 0;
        for(int i = 0; i < 4; i++)
        {
            if(game.curedDiseases[i] == 1) {
                curedCount++;
                System.out.print("\nNumber of cured diseases: " + curedCount);
            }
            else if (game.curedDiseases[i] == 2)
            {
                eCount++;
                System.out.print("\nNumber of eradicated diseases: " + eCount);
            }
            else if(game.curedDiseases[i] == 0)
            {
                oCount++;
                System.out.print("\nNumber of diseases that are still rampaging: " + oCount);
            }
        }

        System.out.print("\nThe city that the current player is in: " + game.playerCity);
        }


/****************************************
 * Commented out getters and setters.
 * Not being used for now, but some
 * methods will require these in
 * later implementation.
 ***************************************/
/*public int getNumPlayers() {
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
    }*/
}
