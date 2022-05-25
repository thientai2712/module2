public class Rectangle extends Shape {
    public double width;
    public double length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filler){
        super(color,filler);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return  width*this.length;
    }
    public double getPerimeter(){
        return 2*(width+this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" +
                getWidth()+
                "and length=" + getLength() +
                ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.1,4.5);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 4.3);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5, 3.8, "oreang", true);
        System.out.println(rectangle);
    }
}
