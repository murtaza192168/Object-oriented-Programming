package com.murtaza.ENUMERATIONS;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

public class enums1{

    // enum definition and initialization
     enum Month implements EnumInterface{
        // enums are created inside the class
        // enums are by default public static and final
        // enums have constant that does not create new objects > its the enum constant
        // Since enums are final, they prevent inheritence > enum does not contain child enums
        // Since are static, the type of constants / object is of type ENUM (ACCESSED DIRECTLY BY ENUM)
        Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec ;// these are the constants of type enum

        // CONSTRUCTOR
        private Month()
        {
            // Constructor in enums are
            // > not public or protected bcz new object are not created explicitly: why? : bcz its the enum concept
            // Constructor in enum are by default private and default
            // Hence, when we try to access one constant from enum, it will print all the constants together
            System.out.println("Constructor is called for:" + " "+this.toString()); // toString is used to convert the particualr Object into String
            // hav been internally called like this:
                      //public static final Month Mar = new Month();
        }

        @Override
        public void greet() {
            System.out.println("Hello, The interface can be implemented by the Enums");
        }
    }


    public static void main(String[] args) {
        // In order to access the enum constants / objects you need to create a reference type of it
//         Month m;
//          m = Month.Apr; // Directly accessed the enum constant, as constructors are not allowed to be created
//        OR
//        Month m = Month.Aug;
//        System.out.println(m); // Feb
//        System.out.println(m.Jan); //Jan

        // CONSTRUCTOR CALLED IMPLICITLY
        // Hence, when we try to access one constant from enum, it will print all the constants together
        // Even though we are trying to acess single constant.. it is giving the output with all constants avlb
        Month m;
        m = Month.Nov;
        //output:
//        Constructor is called for: Jan
//        Constructor is called for: Feb
//        Constructor is called for: Mar
//        Constructor is called for: Apr
//        Constructor is called for: May
//        Constructor is called for: Jun
//        Constructor is called for: Jul
//        Constructor is called for: Aug
//        Constructor is called for: Sep
//        Constructor is called for: Oct
//        Constructor is called for: Nov
//        Constructor is called for: Dec



        // For loop to print all constants / objects
//        for(Month month: Month.values()){
//            System.out.println(month);
//        }
//        // ordinal method
//        Month mn = Month.Mar;
//        System.out.println(mn.ordinal()); // ordinal means the position of the constand=t that has been accessed by its reference type



        System.out.println(Month.valueOf("Jan"));
        // Interface call
        m.greet();

    }


//



}
