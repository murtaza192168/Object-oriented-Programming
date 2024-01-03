package com.murtaza.inheritance.INTERFACES;

public class BrandNew_Car {

    /* Separate class for every INTERFACE possible. */
    /* LETS DEEP DIVE INTO IT!! */
    // MediaPlayer - DVDplayer       // Engine - FuelEngine  Electric


                // Media Player Functionalitites buil-up
    // variables - declare and initialise: initialize compulsory bcz it is byDefault final
    private MediaPlayer mplayer; // This interface ka hamne sirf declare karke method ko call kiya hai using this reference "mplayer"
    private Engine engine = new FuelEngine(); // by defualt as Fuel engine

    //Create a constructor
    public BrandNew_Car(){

        mplayer = new DVDplayer();
    }

    public BrandNew_Car(Engine engine){
        this.engine = engine;      // NO USE . Just for experiment
    }



     public void startMusic(){
       mplayer.start();
     }
     public void stopMusic(){
        mplayer.stop();
     }
    public void pauseMusic(){
        mplayer.pause();
    }

     public void start(){
        engine.start();
     }
     public void stop(){
        engine.stop();
     }
     public void upgradeToElectric(){ // Completely new method.. inorder to upgrade the
        //.. engine to Electric
        this.engine = new Electric();

     }



}
