package org.example;

import org.example.factory.pizza.Pizza;

public class SilverBulletPizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.packaging();

        return pizza;
    }

    private Pizza createPizza(String type) {
        if (type.equals("CHEESE")) {
            // return a cheese pizza
        }

        if (type.equals("BASIC")) {
            // return a basic pizza
        }


        throw new IllegalArgumentException("Invalid type: " + type);
    }
}
