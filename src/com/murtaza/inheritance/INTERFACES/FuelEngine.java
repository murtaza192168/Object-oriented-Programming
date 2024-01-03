package com.murtaza.inheritance.INTERFACES;

public class FuelEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Fuel engine of a car has started");
    }

    @Override
    public void stop() {
        System.out.println("Fuel engine of a car has stopped");
    }
}
