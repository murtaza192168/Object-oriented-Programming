package com.murtaza.inheritance.INTERFACES;

public class Electric implements Engine{

    @Override
    public void start() {
        System.out.println("Electric car has  started flowing its current");
    }

    @Override
    public void stop() {
        System.out.println("Electric car stopped its current");
    }
}
