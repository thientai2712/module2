public class Shape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
    }
    private String color;
    private Boolean filled;
    public Shape(){

    }
    public Shape (String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor (String color){
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Boolean getFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
