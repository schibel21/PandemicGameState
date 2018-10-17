package com.example.sweet.pandemicgamestate.objectclasses;

import java.util.ArrayList;

public class City {
    ArrayList<DiseaseCube> diseaseCubes;
    ArrayList<String> adjacentCities;
    Boolean hasResearchLab;
    Boolean isVisited;
    int diseaseCubeCount;

    public City(){
        diseaseCubes = new ArrayList<DiseaseCube>();
        adjacentCities = new ArrayList<String>();
        hasResearchLab = false;
        isVisited = false;
        diseaseCubeCount = 0;
    }
    public void addDiseaseCube(String cubeColor){
        DiseaseCube cube = new DiseaseCube(cubeColor);
        diseaseCubes.add(cube);
        diseaseCubeCount++;

    }
}
