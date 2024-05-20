package org.example.decorator;

public class Cream extends CondimentDecorator {
    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 크림";
    }

    @Override
    double cost() {
        return beverage.cost() + 0.09;
    }
}
