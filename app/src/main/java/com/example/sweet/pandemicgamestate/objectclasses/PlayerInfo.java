package com.example.sweet.pandemicgamestate.objectclasses;

import java.util.ArrayList;

public class PlayerInfo {

        private ArrayList<playerCard> playerHand;
        private int role;
        private City currentLocation;
        private int actionsLeft;

        public PlayerInfo(int playerRole, int initActions, City startLoc, playerCard card1, playerCard card2) {
            role = playerRole;
            actionsLeft = initActions;
            currentLocation = startLoc;
            playerHand.add(card1);
            playerHand.add(card2);

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

        public boolean addCardToPlayerHand(playerCard newCard){
            if(playerHand.size() >= 7){
                return false;
            }
            return true;
        }


}
