package com.example.sweet.pandemicgamestate.objectclasses;
import java.util.ArrayList;

public class PlayerInfo {
    ArrayList<GeneralCards> playerCards;
    String role;
    String location;

    public PlayerInfo(String location){
        this.location = location;
    }


}
