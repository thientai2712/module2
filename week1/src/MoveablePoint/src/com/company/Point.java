package com.company;

import java.util.Arrays;

public class Point {

    public static void main(String[] args) {
	// write your code here
    }
    protected float x = 0.0f;
    protected  float y = 0.0f;
    public Point(float x, float y) {
        this.x= x;
        this.y = y;
    }
    public Point(){

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
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
//    public float getXY(){
//        return Arrays.toString(x,y);
//    }
}
