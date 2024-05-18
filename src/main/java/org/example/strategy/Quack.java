package org.example.strategy;

public class Quack implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("Quack!");
    }
}
