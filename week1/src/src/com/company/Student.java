package com.company;

public class Student {

    public static void main(String[] args) {
        {
            Students.change();
            Students s1 = new Students(111,"Hoang");
            Students s2 = new Students(222,"Khanh");
            Students s3 = new Students(333,"Nam");
            s1.display();
            s2.display();
            s3.display();

        }
    }
}
