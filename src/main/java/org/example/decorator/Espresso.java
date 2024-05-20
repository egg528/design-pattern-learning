package org.example.decorator;

public class DarkRoast extends Beverage {
    protected DarkRoast(String description) {
        super(description);
    }

    @Override
    double cost() {
        return 0.99;
    }
}
