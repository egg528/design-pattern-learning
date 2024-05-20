package org.example.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super("하우스 블렌드 커피");
    }

    @Override
    double cost() {
        return 0.89;
    }
}
