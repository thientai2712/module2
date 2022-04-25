package com.company;

public class Square {
    double edge;
    public Square (double edge){
        this.edge = edge;
    }
    public double getArea (){
        return this.edge * this.edge;
    }
    public double getPrimeter(){
        return this.edge*4;
    }
    public String display(){
        return "Square{"+ edge +"}";
    }
}
