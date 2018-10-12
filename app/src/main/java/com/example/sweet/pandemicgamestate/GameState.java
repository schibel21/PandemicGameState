package com.example.sweet.pandemicgamestate;
/************************************
 * @Kelsi
 * @Johanna
 * @Sarah
 * @Polina
************************************/

/************************************
 * GAME STATE VARIABLES
 *  -p1Cards: GeneralCards
 *  -p2Cards: GeneralCards
 *  -p1Pawn: Pawn
 *  -p2Pawn: Pawn
 *  -numPlayers: int
 *  -playerTurn: String
 *  -actionsLeft: int
 *  -infectionRate: int
 *  -outbreakNum: int
 *  -curedDiseases: int[]
 *  -playerCity: String
 ************************************/

import com.example.sweet.pandemicgamestate.objectclasses.GeneralCards;
import com.example.sweet.pandemicgamestate.objectclasses.Pawn;
import com.example.sweet.pandemicgamestate.objectclasses.RoleCards;

import java.util.ArrayList;

/************************************
 * GameState Constructor
 * Initializes a 2-player game
 * where neither players have any
 * cards or pawns yet and it is
 * player 1's turn.
 ************************************/
public class GameState {
    /* NOTE: The cards a player has will be implemented as an array of general cards
                in the actual game implementation, but are single GeneralCard objects for now
                because the object class is empty and we don't have a "getCardName" function
                implemented yet.
     */
    private GeneralCards p1Cards;
    private GeneralCards p2Cards;
    private RoleCards p1Role;
    private RoleCards p2Role;
    private ArrayList<GeneralCards> playerDeck = new ArrayList<>();
    private ArrayList<GeneralCards> infectionDeck = new ArrayList<>();
    private Pawn p1Pawn;
    private Pawn p2Pawn;
    private int numPlayers;
    private int playerTurn;
    private int infectionRate;
    private int outbreakNum;
    private int actionsLeft;
    private int[] curedDiseases;
    private String playerCity;

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

    public boolean discardPlayerCard(int playersTurn, int numCards, GeneralCards playerCards){
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

    @Override
    public String toString() {
        String fullString;

        String p1String = "\nPlayer 1 cards: " + p1Cards + "\nPlayer 1 role: " + p1Role;
        String p2String = "\nPlayer 2 cards: " + p2Cards + "\nPlayer 2 role: " + p2Role;
        String gameInfo = "\nNumber of players: " + numPlayers + "\nWhich player's turn it is: "
                + "\nThe infection rate is: " + infectionRate
                + "\nThe amount of outbreaks that have occurred: " + outbreakNum
                + "\nThe number of actions left: " + actionsLeft
                + "\nThe city that the current player is in: " + playerCity;

        int curedCount = 0;
        int eCount = 0;
        int oCount = 0;
        String diseaseInfo = "";
        for (int i = 0; i < 4; i++) {
            if (curedDiseases[i] == 1) {
                curedCount++;
                diseaseInfo = "\nNumber of cured diseases: " + curedCount;
            } else if (curedDiseases[i] == 2) {
                eCount++;
                diseaseInfo = diseaseInfo + "\nNumber of eradicated diseases: " + eCount;
            } else if (curedDiseases[i] == 0) {
                oCount++;
                diseaseInfo = diseaseInfo + "\nNumber of diseases that are still rampaging: " + oCount;
            }
        }

        fullString = p1String + p2String + gameInfo + diseaseInfo;
        return fullString;
    }

/****************************************
 * Getters and setters.
 ***************************************/
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
