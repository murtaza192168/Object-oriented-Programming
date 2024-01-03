package com.murtaza.inheritance.INTERFACES;

public class Main {
    public static void main(String[] args) {
        //SCENARIO-1
//        Brake fw = new FourWheeler();
//        fw.start(); // Yeah what is to be accessed depends on referenece type and ANYWAYS in interfaces, unrelated classes can also implement same interfaces so it does not matter

        //SCENARIO-2
//        Brake fw = new FourWheeler();
//        System.out.println(fw.num); // Error cannot access the variable that is been initialsed and declared in FourWheeler class... Here at referenv=ce type mentioned is one of the interface named "Brake" (Cannot be accessed bcz what is to be accessed does not depend on object type. Here Object type is: FourWheeler)

        //SCENARIO-3 Engine.
//        Engine fw = new FourWheeler(); will work when name is accessed
//        FourWheeler fw = new FourWheeler(); // also will work when name is accessed
//        System.out.println(fw.name); // Correct bcz




//        FourWheeler fw = new FourWheeler();
//        System.out.println(fw.num); // can access bcz what is to be accesed depends on the reference type
        // here reference type is FourWheeler class and the variable has been initialised in FourWheeler class only.. so yeah



        // Now you can call the class where all other interfaces are implemented
//        Brake fw = new FourWheeler();
////        fw.start();
//        fw.stop();

        // I need to stop the media player in a car
//        MediaPlayer carMediaPlayer = new FourWheeler();
        // this will be printed bcz the classes in interfaces are unrelated and implements same interfaces for all
//        carMediaPlayer.stop(); // I am ready to stop the engine sir!
        // LOL no coordination.. so THERE IS A SOLUTION FOR THIS.. LETS DEEP DIVE
        // Answer) So, you can create separate classes for an Interface


        // /* Separate class for every INTERFACE possible. */
        //        /* LETS DEEP DIVE INTO IT!! */
        //       // MediaPlayer - DVDplayer       // Engine - FuelEngine  Electric

        //CALL THEM

        BrandNew_Car car = new BrandNew_Car();
        car.start(); // fuel engine car starts
        car.stop(); // fuel engine car stops
        car.upgradeToElectric(); // Fuel engine to Electric (Changed)
        car.start(); // Electric start

        car.startMusic();





    }
}
