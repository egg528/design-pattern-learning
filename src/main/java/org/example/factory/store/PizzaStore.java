package org.example.factory.store;

import org.example.factory.enums.PizzaType;
import org.example.factory.pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.packaging();

        return pizza;
    };

    protected abstract Pizza createPizza(PizzaType type);
}
