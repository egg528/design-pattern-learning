package org.example.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super("다크 로스트 커피");
    }

    @Override
    double cost() {
        return 1.99;
    }
}
