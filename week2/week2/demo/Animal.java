package demo;

public class Animal {
    protected String color;
    protected String name;
    public Animal(String color,String name){
        this.color = color;
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
