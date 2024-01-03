package com.murtaza.package1.accessControl;

public class Access {

    public static void main(String[] args) {

    }

    // instance vars
    /*private modifier*/private int num; //ok
    int[] arr;
    /*public modifier*/public String name; //ok
    /*default modifier*/ float decimal_num;

    static protected char ch = 'm';



    // default constructor
    public Access(){
        this.num = 3;
        this.arr = new int[num];
        this.name = "Ali";
        this.decimal_num = 23.98f;
        this.ch = 'n';
    }


    // Param constructior
    public Access(int num, String name, float decimal_num, char letter){
        this.num = num;
        this.arr = new int[num];
        this.name = name;
        this.decimal_num = decimal_num;
        this.ch = letter;
    }

    // using getters method
    public int getNumber(){
        return num;
    }
    // can set (update) the value as well i.e. by setter method
    public void setNumber(int number){
        this.num = number;
    }
}
