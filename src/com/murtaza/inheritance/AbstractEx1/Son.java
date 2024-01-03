package com.murtaza.inheritance.AbstractEx1;

public class Son extends Parent{
    int age;
    // you can create a constructor as well as call the constructor/create an object of an overriden class that has accessed the methods definition from the parent abstract class
    public Son(int age, String name){
    super(name);
    this.age = age;

    }
    @Override
     void passion(){
        System.out.println("Singing is my passion");
    }
    @Override
     void profession(){
        System.out.println("Profession is t be a Programmer");
    }

    @Override
    public void career() {
        super.career();
    }
}
