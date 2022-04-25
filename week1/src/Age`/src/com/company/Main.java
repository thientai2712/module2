package com.company;

public class Main {

    public static void main(String[] args) {
        Person a = new Person("Chau", 75.2f);
     //   a.age=-20;
        System.out.println(" Tuổi của " +a.name+" là: " + a.getAge());
        a.setAge(-20);
        System.out.println(" Tuổi của " +a.name+" là: " + a.getAge());
    }
}
