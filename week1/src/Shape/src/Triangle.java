public class Triangle extends Shape {
    protected double side1 = 1.0;
    protected double side2 = 1.0;
    protected double side3 = 1.0;
    double p = getPerimeter()/2;
    public Triangle(){

    }
    public Triangle(double side1, double side2, double side3, String color, Boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide3() {
        return side3;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public double getArea(){
     return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    public double getHeight(){
        double h= 2*((Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)))  /2);
        return h;
    }

    @Override
    public String toString() {
        return "Area= " + getArea() +
                ", Perimeter= " + getPerimeter() +
                ", String= " + super.toString() +
                '}';
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(4.0,3.0,4.0,"Red", false);
        System.out.println(triangle);

    }
}
