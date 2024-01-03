package com.murtaza.package1.accessControl;

public class Main {
    public static void main(String[] args) {
        // create obj and call constructor
        Access ac = new Access(10,"Murtaza", 23.45f, 'o');
//        System.out.println();
        char protectedAccMod = ac.ch;
        System.out.println(protectedAccMod);

       /* ac.num; */  // cannot be accessed directly: data hiding concept - instance has been declared as private
        // BUT BUT YOU CAN ACCESS IT VIA getters and setters (through ENCAPSULATION: where your data will be wrapped in a container i.e. a getter methos and then you can call that getter method and even you can set the value of that private instance var)
        int get = ac.getNumber(); // bcz have a return type
        ac.setNumber(8);

        // accessing public access modifier: accessible from ANYWHERE
        String publicModifier = ac.name;

        // Accessing default access modifier instance:
        // Can be accessed bcz we are accessing it inside the same package
        float defaultModifier = ac.decimal_num;
        // But this cannot be accessed by outside packages


    }
}
