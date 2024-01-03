package com.murtaza.inheritance.INTERFACES;

 // A class that willl not be able to extend > implement multiple interfaces
public class FourWheeler implements Brake{

    int num = 23;
   @Override       // here all methods are overriden from multiple interfaces
    public void start(){
        System.out.println("I am ready to start 'the engine !");
    }
    public void stop(){
        System.out.println("I am ready to stop the engine sir!");
    }


}
