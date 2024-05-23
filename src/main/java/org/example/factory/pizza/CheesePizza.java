package org.example.factory;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        this.name = "치즈 피자";
        this.dough = "씬 크러스트 도우";
        this.sauce = "마리마나 소스";

        this.toppings.add("잘게 썬 레지아노 치즈");
    }
}
