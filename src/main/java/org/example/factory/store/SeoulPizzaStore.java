package org.example.factory.store;

import org.example.factory.enums.PizzaType;
import org.example.factory.ingredient.NewYorkPizzaIngredientFactory;
import org.example.factory.ingredient.PizzaIngredientFactory;
import org.example.factory.ingredient.SeoulPizzaIngredientFactory;
import org.example.factory.pizza.BasicPizza;
import org.example.factory.pizza.CheesePizza;
import org.example.factory.pizza.Pizza;

public class SeoulPizzaStore extends PizzaStore {
    private final PizzaIngredientFactory ingredientFactory = new SeoulPizzaIngredientFactory();
    @Override
    protected Pizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new CheesePizza(ingredientFactory);
            case BASIC -> new BasicPizza(ingredientFactory);
        };
    }
}
