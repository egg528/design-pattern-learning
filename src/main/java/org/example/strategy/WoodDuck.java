package org.example.strategy;

public class WoodDuck extends Duck {
    public WoodDuck(FlyBehavior fiyBehavior, BarkBehavior barkBehavior) {
        super(fiyBehavior, barkBehavior);
    }
}
