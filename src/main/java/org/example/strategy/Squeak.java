package org.example.strategy;

public class Squeak implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("Squeak!");
    }
}
