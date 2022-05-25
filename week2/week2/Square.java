public class Square extends Rectangle implements Colorable{

    private double side;

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side = " +
                getSide() + ", which is a subclass of "
                + super.toString()+
                "Area= "+getArea()+
                ", Prerimeter= "+
                getPerimeter();
    }
    @Override
    public void howToColor() {
        System.out.println("Color: 4 side");
    }
}
