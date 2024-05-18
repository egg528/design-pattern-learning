package org.example.strategy;

public abstract class Duck implements BarkBehavior, FlyBehavior {

    // final을 제거하고 setter 메서드를 추가해 Runtime 환경에서 전략을 변경할 수도 있다.
    private final FlyBehavior fiyBehavior;
    private final BarkBehavior barkBehavior;


    public Duck(FlyBehavior fiyBehavior, BarkBehavior barkBehavior) {
        this.fiyBehavior = fiyBehavior;
        this.barkBehavior = barkBehavior;
    }

    public void fly() {
        fiyBehavior.fly();
    }

    public void bark() {
        barkBehavior.bark();
    }
}
