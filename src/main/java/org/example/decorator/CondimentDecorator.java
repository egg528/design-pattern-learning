package org.example.decorator;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    protected CondimentDecorator() {}

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
