package org.example.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        super("에스프레소");
    }

    @Override
    double cost() {
        return 1.99;
    }
}
