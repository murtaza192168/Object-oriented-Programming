package com.murtaza.inheritance.INTERFACES;

public interface Engine {

    static final String name = "Aliakbar";// This variable in this parent class that implements all other interfaces, Can be accessed .. no matter what reference type is (reference type can be any, bcz obv this is how multiple inheritance work// ),
    // since in INTERFACES, variables are static&final BY DEFAULT
    // so, you need to initialize it along with declaring it bcz since consructors are not allowed to be created in INTERFACE .. thats why by default variables are declared as final (and static) so that you have initialize it here only
    static final int m = 23; // static final are not highlighted because it is declared by defualt

    // abstract methods in INTERFACES:
    public abstract void start();
    void stop();

}
