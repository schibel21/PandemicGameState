package com.example.sweet.pandemicgamestate.objectclasses;

import java.util.ArrayList;

public class City {
    String name;
    ArrayList<DiseaseCube> diseaseCubes;
    ArrayList<String> adjacentCities;
    Boolean hasResearchLab;
    Boolean isVisited;
    int diseaseCubeCount;

    //Default constructor
    public City(String name, String name1, String name2, String name3, int count){
        this.name = name;
        diseaseCubes = new ArrayList<DiseaseCube>();
        adjacentCities = new ArrayList<String>();
            adjacentCities.add(name1);
            adjacentCities.add(name2);
            adjacentCities.add(name3);
        hasResearchLab = false;
        isVisited = false;
        diseaseCubeCount = count;
    }

    //Copy constructor
    public City(City city){
        this.name = city.name;
        this.diseaseCubes = city.diseaseCubes;
        this.adjacentCities = city.adjacentCities;
        this.hasResearchLab = city.hasResearchLab;
        this.isVisited = city.isVisited;
        this.diseaseCubeCount = city.diseaseCubeCount;
    }


    //Adds new disease cube to array of disease cubes
    public void addDiseaseCube(String cubeColor){
        DiseaseCube cube = new DiseaseCube(cubeColor);
        diseaseCubes.add(cube);
        diseaseCubeCount++;

    }

    //getters and setters for all variables
    public ArrayList<DiseaseCube> getDiseaseCubes() {
        return diseaseCubes;
    }

    public ArrayList<String> getAdjacentCities() {
        return adjacentCities;
    }

    public Boolean getHasResearchLab() {
        return hasResearchLab;
    }

    public Boolean getVisited() {
        return isVisited;
    }

    public int getDiseaseCubeCount() {
        return diseaseCubeCount;
    }

    public String getName() {
        return name;
    }
}
