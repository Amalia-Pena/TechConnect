package com.techelevator;

import java.awt.geom.Area;


public class Wall extends PaintCalculator {

    private String name;
    private String color;
    private int area;

    public Wall(String name, String color) {   //Constructor
        this.name = name;
        this.color = color;
    }

    public String getName() {     // Getters
        return name;
    }

    public String getColor() {
        return color;
    }


    public void setName(String name) {   // Setters
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
