package org.example.strategy;

public class Mute implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("Do Nothing");
    }
}
