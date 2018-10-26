package com.example.sweet.pandemicgamestate.objectclasses;

import java.util.ArrayList;

public class PlayerInfo {

        private ArrayList<PlayerCard> playerHand;
        private int role;
        private City currentLocation;
        private int actionsLeft;
        private int playerNumber;

        //default constructor
        public PlayerInfo(int playerNumber, int playerRole, int initActions, City startLoc, PlayerCard card1, PlayerCard card2) {
            this.playerNumber = playerNumber;
            this.role = playerRole;
            this.actionsLeft = initActions;
            this.currentLocation = startLoc;
            this.playerHand.add(card1);
            this.playerHand.add(card2);

        }
        //copy constructor
    public PlayerInfo(PlayerInfo otherPlayerInfo){
        for(int i = 0; i<otherPlayerInfo.playerHand.size(); i++){
            this.playerHand.add(new PlayerCard(otherPlayerInfo.playerHand.get(i)));
        }
        this.role = otherPlayerInfo.role;
        this.currentLocation = otherPlayerInfo.currentLocation;
        this.actionsLeft = otherPlayerInfo.actionsLeft;
        this.playerNumber = this.getPlayerNumber();
    }


    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public ArrayList<PlayerCard> getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(ArrayList<PlayerCard> playerHand) {
        this.playerHand = playerHand;
    }

    public int getRole(){
            return role;
        }

        public City getCurrentLocation(){
            return currentLocation;
        }

        public void setCurrentLocation(City newLocation){
            currentLocation = newLocation;
        }

        public int getActionsLeft(){
            return actionsLeft;
        }

        public void actionTaken(){
            actionsLeft--;
        }

        public boolean addCardToPlayerHand(PlayerCard newCard){
            if(playerHand.size() >= 7){
                return false;
            }
            return true;
        }

    public void setActionsLeft(int actionsLeft) {
        this.actionsLeft = actionsLeft;
    }
}
