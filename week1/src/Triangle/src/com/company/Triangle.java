package com.company;

public class Triangle extends Shape{
    protected String color;
    protected  boolean filled;
    public  Triangle (double side1, double side2, double side3, String color, boolean filled ){
    super(side1,side2,side3);
    this.color = color;
    this.filled = filled;
    }

    @Override
    public String toString() {
        return "Triangle{" +" peri= "+
                super.getPerimeter()+" Area= "+
                super.getArea()
                +
                " color= '" + color + '\'' +
                ", filled= " + filled +
                '}';
    }
}
