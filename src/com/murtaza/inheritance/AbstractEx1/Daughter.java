package com.murtaza.inheritance.AbstractEx1;

public class Daughter extends Parent{
    int age;

    public Daughter(String name, int age){
        super(name);
//        this.name = name;
        this.age = age;
    }
    @Override
    void passion(){
        System.out.println("Dancing is my passion");
    }
    @Override
    void profession(){
        System.out.println("Profession is t be a Socialist");
    }

    public void career(){
        System.out.println("Hi, I can also override a normal method"); // normal method can a;so be ovridden in the child classes of the abstract class
    }
}
