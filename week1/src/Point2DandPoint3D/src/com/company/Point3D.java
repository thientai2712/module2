package com.company;

public class Point3D extends Point2D {
    public float z = 0.0f;
    public Point3D (float x, float y, float z){
    super(x, y);
    this.z=z;
    }
    public Point3D(){

    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setXYZ(float x,float y, float z){
        this.z = z;
        x = x;
        y = y;
    }
    public float [] getXYZ(){
        float array[] = {x,y,z};
        return array;
    }

    @Override
    public String toString() {
        return " Point3D{" +
                " z= " + z + super.toString() +
                 '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(3.0f,2.0f,1.0f);
        System.out.println(point3D);
    }
}
