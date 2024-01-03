package com.murtaza.Generics;

public class MainInterfaceWithGenerics implements InterfaceWithGenerics<Integer>{
   @Override
    public void display(Integer num){
       num = 23;
        System.out.println("Number = " + num);
    }
}
