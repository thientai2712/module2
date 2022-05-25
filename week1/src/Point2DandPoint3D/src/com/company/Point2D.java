package com.company;

public class Point2D {

    public static void main(String[] args) {
	Point2D point2D = new Point2D(2.0f,3.0f);
        System.out.println(point2D);

    }
    protected float x = 0.0f;
    protected  float y = 0.0f;
    public Point2D(){

    }
    public Point2D (float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float [] getXY(){
        float [] array = {x,y}
        return x;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
