package com.murtaza.inheritance.INTERFACES;

public interface video {
    // since in INTERFACES, variables are static&final BY DEFAULT
    // so, you need to initialize it along with declaring it bcz since consructors are allowed to be created in INTERFACE .. thats why by default variables are declared as final (and static) so that you have initialize it here only
    static final int m = 23; // static final are not highlighted because it is declared by defualt

    // abstract methods in INTERFACES:
    void start();
    void stop();
    void rewind();

}
