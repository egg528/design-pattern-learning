package org.example.factory.ingredient;

public class NewYorkPizzaIngredientFactory extends PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }
}
