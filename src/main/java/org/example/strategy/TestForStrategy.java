package org.example.strategy;

public class TestForStrategy {
    public static void main(String[] args) {
        Duck woodDuck = new WoodDuck(new FlyNoWay(), new Mute());

        woodDuck.fly();
        woodDuck.bark();
    }
}
