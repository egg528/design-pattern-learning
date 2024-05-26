package org.example.factory;

import org.example.factory.pizza.Pizza;

public class PizzaFactory {
    public Pizza createPizza(String region, String type) {
        if (region.equals("SEOUL")) {
            if (type.equals("CHEESE")) {
                // return a Seoul style cheese pizza
            }

            if (type.equals("BASIC")) {
                // return a Seoul style basic pizza
            }
        }

        if (region.equals("NEWYORK")) {
            if (type.equals("CHEESE")) {
                // return a New York style cheese pizza
            }

            if (type.equals("BASIC")) {
                // return a New York style basic pizza
            }
        }

        throw new IllegalArgumentException("Invalid region or type: " + region + ", " + type);
    }
}
