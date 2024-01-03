package com.murtaza.inheritance.AbstractEx1;

public class Main {
    public static void main(String[] args) {
        // Object for Son child class hat has been overriden from parent
        Son objS = new Son(22, "Murtaza");
        objS.passion();
        objS.profession();
        // param-constructor calling and creating object of overriden classes
        // Constructor abj
        System.out.println(objS.name); // Murtaza


        // Object for Daughter child class hat has been overriden from parent
        Daughter objD = new Daughter("Fattu", 27);
        objD.passion();
        objD.profession();
        // param-constructor calling and creating object of overriden classes
        // Constructor abj
        System.out.println(objD.age); // 27

        // Can  we call the Parent abstract class consructor? or create its object???
       // Parent objP = new Parent("Ali"); // Error
        // Hence you cannot create obj or call a constructor of parent abstract class
        objD.career(); // a normal method / public methd called that is declared in abstract class

        // invoking static method
        Parent.greet();// Hello bro, I am static
    }
}
