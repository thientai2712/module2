package com.company;

import com.company.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeNoise() {
        return "ò ó ooooooooooooo";
    }

    @Override
    public String howToEat() {
        return "Mổ ooooooo";
    }
}
