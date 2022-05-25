package abstract_interface;

public class Dog extends Animal implements Runable,Barkable{
    @Override
    public String bark() {
        return "Chó sủa Gâu uuuuuuuuuuuuu";
    }

    @Override
    public String run() {
        return "Chó chạy So fasttt";
    }
}
