package shape;

public class Rectangle extends Shape implements Resizeable {
    public double width;
    public double height;
    public Rectangle(int x, int y, String blue, boolean b){
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;

    }
    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + this.width +
                " and height = " + this.height + ", which is a subclass of "
                + super.toString();

    }

    @Override
    public void resize(double percent ) {
        width *= Math.sqrt(percent);
        height *= Math.sqrt(percent);
    }
}
