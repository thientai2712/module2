package com.company;

public class Rectangle {
   double width, height;
   public Rectangle (double width, double height){
       this.height = height;
       this.width = width;
   }
   public double getArea(){
       return this.width*this.height;
   }
   public double getPrimeter(){
       return (this.height+this.width)*2;
   }
   public String display(){
       return "Rectangle {" + width +",height= "+ height + "}";
   }
}
