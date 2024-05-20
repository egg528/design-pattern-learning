package org.example.decorator;

public abstract class Beverage {
    private String description;

    // for Decorator
    protected Beverage() {}

    // for Beverage
    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    abstract double cost();
}
