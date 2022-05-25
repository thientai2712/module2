package abstract_interface;

public class Car extends Machine implements Runable{
    @Override
    public String run() {
        return "Xe chạy Very fastttt";
    }
}
