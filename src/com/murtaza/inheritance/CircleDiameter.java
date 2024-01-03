package com.murtaza.inheritance;

public class CircleDiameter extends Circle{
    double diam;

    CircleDiameter(){
        super();
        this.diam = 12.5;
    }
    public CircleDiameter(String color, double diameter){ // hierachial inheritence
        super(color);
        this.diam = diameter;
    }
}
