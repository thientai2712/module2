package com.company;

public class Student {

    public static void main(String[] args) {
	Student student = new Student();
        System.out.println(student.getClasses());
        System.out.println(student.getName());
        student.name = "Bill";
        System.out.println(student.name);
        student.classes = "C021";
        System.out.println(student.classes);
    }
    private String name = "John";
    private String classes = "C02";
    public Student (){

    }

    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
    public String getName(){
        return name;
    }
    public String getClasses(){
        return classes;
    }

}
