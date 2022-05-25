package demo;

public class Pig extends Animal implements Runable{
    public Pig(String color, String name) {
        super(color, name);
    }

    @Override
    public void howtoRun() {
        System.out.println("Heo chạy rất nhanh");
    }
}
