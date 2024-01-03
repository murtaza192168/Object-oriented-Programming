package com.murtaza.package2;

import com.murtaza.package1.accessControl.SubAccess;




public class AcessModMain {

    // public access modifier accessining
    // create object and call constructor
    public static void main(String[] args) {
        SubAccess saObj = new SubAccess(12, "Yusuf", 77.76f, 't',"AI");
        String publicAccessMod = saObj.name; // public mod accessed
        // private


//        char resultProtectedAccMod = saObj.ch; // not accessible


//        float defaultModnum = saObj.decimal_num; /*default modifier cannot be accessed outside its package*/
    }
}
