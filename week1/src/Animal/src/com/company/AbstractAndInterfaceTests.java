package com.company;


import com.company.Edible.Edible;
import com.company.fruit.Apple;
import com.company.fruit.Fruit;
import com.company.fruit.Orange;

public class AbstractAndInterfaceTests {

//    public static void main(String[] args) {
//        Animal[] animals = new Animal[2];
//        animals[0] = new Tiger();
//        animals[1] = new Chicken();
//        for (Animal animal : animals) {
//            System.out.println(animal.makeNoise());
//            if (animal instanceof Chicken){
//                Edible edible = new Edible() {
//                    @Override
//                    public String howToEat() {
//                        return "Mổ mỏoooooo";
//                    }
//                };
//                System.out.println("Con gà: "+edible.howToEat());
//            }
//        }
//    }
public static void main(String[] args) {
    Fruit[] fruits = new Fruit[2];
    fruits[0] = new Apple();
    fruits[1] = new Orange();
    for (Fruit fruit : fruits) {
        System.out.println(fruit.howToEat());
    }
}
}
