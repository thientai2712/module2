package com.company;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(double radius){
        this.radius = radius;
    }

    private double getRadius() {
        return radius;
    }

    protected double getArea() {
        return Math.pow(getRadius(), 2)*Math.PI;
    }

}
