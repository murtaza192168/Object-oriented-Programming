package com.murtaza.ExceptionHandling;

public class CustomException extends Exception{

    // Create a para constructor
    public CustomException(String message){
        super(message); // Calling its parent class constructor i.e Exception class
    }
}
