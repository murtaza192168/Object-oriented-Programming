package com.murtaza.inheritance.INTERFACES;

public class DVDplayer implements MediaPlayer{

    @Override
    public void start() {
        System.out.println("Media player started");
    }

    @Override
    public void stop() {
        System.out.println("Media player stopped!");
    }

    public void pause(){
        System.out.println("Media player paused");
    }
}
