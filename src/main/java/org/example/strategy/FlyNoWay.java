package org.example.strategy;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Do Nothing");
    }
}
