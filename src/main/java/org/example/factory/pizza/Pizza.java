package org.example.factory.pizza;

import org.example.factory.ingredient.Dough;
import org.example.factory.ingredient.Sauce;


public abstract class Pizza {
    protected String name;
    protected final Dough dough;
    protected final Sauce sauce;

    protected Pizza(Dough dough, Sauce sauce) {
        this.dough = dough;
        this.sauce = sauce;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분 간 굽는 중...");
    }

    public void cut() {
        System.out.println("피자를 조각내는 중입니다...");
    }

    public void packaging() {
        System.out.println("포장 중입니다...");
    }
}
