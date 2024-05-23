package org.example.factory;

import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings;

    void prepare() {
        System.out.println(name + " 피자를 준비 중입니다...");
        System.out.println(dough + " 도우를 돌리고...");
        System.out.println(sauce + " 소스를 뿌리고...");
        System.out.println("토핑을 올립니다");
        for (String topping : toppings) {
            System.out.println(topping);
        }
    }

    void bake() {
        System.out.println("175도에서 25분 간 굽는 중...");
    }

    void cut() {
        System.out.println("피자를 조각내는 중입니다...");
    }

    void packaging() {
        System.out.println("포장 중입니다...");
    }
}
