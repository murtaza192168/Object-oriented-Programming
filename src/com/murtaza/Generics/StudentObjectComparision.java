package com.murtaza.Generics;

public class StudentObjectComparision implements Comparable<StudentObjectComparision> { // Using this interface method, between two objects comparision we can get result



    // instance vars
    int roll_no;
    float marks;

    public StudentObjectComparision(int roll_no, float marks){
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentObjectComparision o){
        int difference = (int)(this.marks  - o.marks ); // internal method of comparing: refer Comparable interface ka document
        return difference;
    }
    // toString method in order to print objects in String
    @Override
    public String toString() {
        return
                "marks=" + marks
                ;
    }
}
