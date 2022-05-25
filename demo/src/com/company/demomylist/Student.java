package com.company.demomylist;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        Set<Student> setB = new HashSet<Student>();
        setB.add(new Student(1, "Tai"));
        setB.add(new Student(1, "Tai"));
        setB.add(new Student(2, "Bui"));
        setB.add(new Student(3, "Thien"));
        System.out.println("Số phần tử của setB= "+setB.size());
        for (Student student : setB){
            System.out.println(student+ "" +student.hashCode());
        }
        Student student1 = new Student(1, "Tai");
        Student student2 = new Student(1, "Tai");
        System.out.println(student1.equals(student2));
        int tai = 1;
        Integer tai1 = new Integer(1);
        System.out.println(tai == tai1);
    }
}
