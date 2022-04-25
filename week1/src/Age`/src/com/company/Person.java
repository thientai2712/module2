package com.company;

public class Person {
    public String name;
    private int age;
    public float height;

    public Person(String name, float height) {
        this.name = name;
        //this.age = age;
        this.height = height;
    }

    public void setAge(int age) {
        if (age>=0 && age<=100 ) {
            this.age = age;
        }
    }
    public int getAge() {
        return this.age;
    }
}
