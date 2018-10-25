package com.example.sweet.pandemicgamestate.objectclasses;

import java.util.ArrayList;

public class PlayerInfo {

    private ArrayList<GeneralCards> playerCards;
    private String role;
    private String location;

    public PlayerInfo() {

    }



    public String playerLocation(String location){
        this.location = location;
        return location;
    }


}
