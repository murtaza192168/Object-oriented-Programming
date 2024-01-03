package com.murtaza.staticExample3;

public class InnerClassasStatic { // outer class
    //instance vars
    static String name;  // when its about declaring and accessing from outer class,>> 1) if instance is not declare as satic and obvio outerclass cannot be static so the output will be as per the objects as non static member belongs to the object.
                         // 2) If instance var is declared with static, then both the values of both or n objects will be resulted as the recent value object all same
    //Param constructor
    InnerClassasStatic(String human_name){
        InnerClassasStatic.name = human_name; // convention to access a static member, is via its class name only. You can even access it through this keyword but its not a good practice and not logical

    }
    public static class Inner{
        //instance vars
         static String name;
        //Param constructor
        Inner(String human_name){
            Inner.name = human_name;
        }
    }


    public static void main(String[] args) {
        Inner i = new Inner("Mumtaz");
        Inner i2 = new Inner("Shahjahaan");  // both for inner class
       // only one obj passed
        System.out.println(i.name);


        // if two or more objs passed than the recent object created it will take that value into consideration for object values that were created previously
      //  System.out.println(Inner.name); // Shahjahaan
      //  System.out.println(Inner.name); // Shahjahaan

        InnerClassasStatic i1 = new InnerClassasStatic("Mumtaz");
        InnerClassasStatic i3 = new InnerClassasStatic("Shahjahaan");
        System.out.println(i1.name);
        System.out.println(i3.name);
    }
}
