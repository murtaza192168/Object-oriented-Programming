package com.murtaza.package1.accessControl;

import com.murtaza.inheritance.Circle;

public class SubAccess extends Access{
    public static void main(String[] args) {
        SubAccess saObj1 = new SubAccess(12, "Yusuf", 77.76f, 'x',"AI");
//            saObj1.num;    /*Private access modifier cannot be accessed diectly*/
             float numdefaultMod =  saObj1.decimal_num;
             char resultProtectedAccMod = saObj1.ch; // accessible

        System.out.println(saObj1 instanceof Object); // instance Operator to check whether the object instance is an instance of a particular class?!!
    }
    String dept;
    // param constructor
    public SubAccess(int num, String name, float decimal_num, char letter,String department){
        super(num, name,decimal_num, letter);
        this.dept = department;
    }
}

