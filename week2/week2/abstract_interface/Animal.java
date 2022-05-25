package abstract_interface;
abstract class Animal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Bird();
        animals[2] = new Fish();
        Machine[] machines = new  Machine[2];
        machines[0]= new Car();
        machines[1]= new Airplane();
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Barkable barkable = (Dog) animal;
                System.out.println(((Dog) animal).bark());
            }
            if (animal instanceof Dog) {
                Barkable barkable = (Dog) animal;
                System.out.println(((Dog) animal).run());
            }
            if (animal instanceof Bird) {
                Flyable flyable = (Bird) animal;
                System.out.println(((Bird) animal).fly());
            }
            if (animal instanceof Fish) {
                Swimable swimable = (Fish) animal;
                System.out.println(((Fish) animal).swim());
            }
        }
        for (Machine machine : machines) {
            if (machine instanceof Car){
                Runable runable = (Car) machine;
                System.out.println(((Car) machine).run());
            }
            if (machine instanceof Airplane){
                Flyable flyable = (Airplane) machine;
                System.out.println("Máy bay "+((Airplane) machine).fly());
            }
        }

    }
}
