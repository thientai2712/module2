public class Circle extends Shape {
    public double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return radius *2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=xxx, " +
                "which is a subclass of yyy" + radius +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(4.5);
        System.out.println(circle);
        circle = new Circle(3.6, "indigo", false );
        System.out.println(circle);
    }
}
