package com.company;

public class FanClass {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass(FAST, false, 10, "yellow");
        System.out.println(fan1);
        FanClass fan2 = new FanClass(MEDIUM, true, 5, "blue");
        System.out.println(fan2);
    }
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private boolean on;
    private double radius;
    private String color;
    private int speed;
    public FanClass(int fast, boolean b, int i, String getColor) {
        speed = fast;
        on = b;
        radius = i;
        color = getColor;
    }
    public static int getSlow(){
        return SLOW;
    }
    public static  int getMedium(){
        return MEDIUM;
    }
    public static int getFast(){
        return FAST;
    }
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    public  void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public void  setRadius(double newRadius){
        radius = newRadius;
    }
    public String getSpeed(){
        String s = "";
        switch (speed){
            case SLOW: s ="SLOW"; break;
            case MEDIUM: s = "MEDIUM"; break;
            case FAST: s = "FAST";
        }
        return s;
    }
    public boolean isOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        if (on == true){
            return "\nFan speed: " + getSpeed()+ isOn() + ", color:"+color+ ", radius: "+radius+"\n";
        }else {
            return "\nFan color: " + color + ", radius: " + radius +
                    "\nfan is off\n";
        }
    }
}
