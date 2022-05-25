package com.company;

public class Students {
    private int rollno;
    private String name;
    private static java.lang.String college = "BBDIT";

    public Students(int r, java.lang.String n) {
    }

    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno +""+name+""+college);
    }
}
